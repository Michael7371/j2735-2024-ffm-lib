# J2735-ffm-java

This is a Java library and API for invoking J2735 (2024) encode/decode functions on C code generated by asn1c  
using the new Foreign Function and Memory API available in Java 22, and a Java wrapper generated
by the Jextract tool.

It enables converting between various ASN.1 encodings:
* XER - XML Encoding Rules
* JER - JSON Encoding Rules
* UPER - Unaligned Packed Encoding Rules

## Quickstart

Requires:

* Docker

Run docker-compose from the root directory:

```bash
docker compose up --build -d
```

Use the *.http scripts in the `/j2735-2024-api/http-tests` directory to test the API.  These scripts work with
IntelliJ IDE, or in VSCode with the REST Client extension.

The following translation methods are available at base URL https://localhost:4000 
All methods are POSTs.

| Method        | Description            |
|---------------|------------------------|
| /jer/uper/bin | JER to UPER binary     |
| /jer/uper/hex | JER to UPER hex string |
| /jer/xer      | JER to XER             |
| /uper/bin/xer | UPER binary to XER     |
| /uper/bin/jer | UPER binary to JER     |
| /uper/hex/jer | UPER hex string to JER |
| /uper/hex/xer | UPER hex string to XER |
| /xer/jer      | XER to JER             |
| /xer/uper/bin | XER to UPER binary     |
| /xer/uper/hex | XER to UPER hex string |

Content types are:

| Encoding    | Content Type             |
|-------------|--------------------------|
| UPER binary | application/octet-stream |
| UPER hex    | text/plain               |
| XER         | application/xml          |
| JER         | application/json         |

## How it works

### Native library

A native, dynamic library, `libasnapplication.so`, was created from asn1c generated C code. 
The library is included in the `j2735-2024-ffm-lib/c-lib` directory.

See details about getting the ASN.1 files to compile here: [Hacks needed to get asn1c to compile the J2735 (2024) ASN.1 files](j2735-2024-ffm-lib/hacks/README.md)

And details on creating the native library here:
[J2735 (2024) Dynamic Library](j2735-2024-ffm-lib/c-lib/README.md)

The `Dockerfile` installs the native library in the `/usr/lib` directory of the runtime image, which makes it
generally available to applications running on that image.

### Java library

The Java library, `j2735-2024-ffm-lib`, includes code generated by the Jextract tool, plus a 
[MessageFrameCodec](https://github.com/iyourshaw/j2735-2024-ffm-lib/blob/main/j2735-2024-ffm-lib/src/main/java/j2735ffm/MessageFrameCodec.java)
class that exposes several easy-to-use functions for converting between XER, JER, and UPER, as well as
methods for converting each encoding to/from an in-memory `MessageFrame_t` data structure, which is C struct that can 
be read and manipulated from Java code with the wrapper functions, or passed back to native methods.

Native method calls and native data structures are handled inside a Java thread-scoped "Arena".  
Arenas are FFM's way of limiting the scope and lifetime of memory used by native methods, to prevent memory leaks
and security issues.
See: [docs.oracle.com: Memory Segments and Arenas](https://docs.oracle.com/en/java/javase/22/core/memory-segments-and-arenas.html#GUID-01CE34E8-7BCB-4540-92C4-E127C1F62711)

Java FFM bindings were generated by running the Jextract tool on the `MessageFrame.h` header file on an Ubuntu VM with
the native library installed on it as follows:

[Download Jextract](https://jdk.java.net/jextract/)

`MessageFrame.h` is the top level header that contains all the others transitively.

Run `jextract` with a command line similar to:

```bash
./jextract \
    --include-dir ./headers \
    --output ./java-src \
    --target-package j2735_2024_MessageFrame \
    --library asnapplication \
    ./headers/MessageFrame.h 
```

where the `/headers` directory contains all the generated C headers, and `asnapplication` is the platform-dependent name
of the native library (which on linux is the file name minus the `lib` prefix and `.so` extension), and the `java-src` 
directory receives the generated source.
















