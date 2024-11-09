// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct asn_enc_rval_s {
 *     ssize_t encoded;
 *     const struct asn_TYPE_descriptor_s *failed_type;
 *     const void *structure_ptr;
 * }
 * }
 */
public class asn_enc_rval_s {

    asn_enc_rval_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("encoded"),
        MessageFrame_h.C_POINTER.withName("failed_type"),
        MessageFrame_h.C_POINTER.withName("structure_ptr")
    ).withName("asn_enc_rval_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong encoded$LAYOUT = (OfLong)$LAYOUT.select(groupElement("encoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ssize_t encoded
     * }
     */
    public static final OfLong encoded$layout() {
        return encoded$LAYOUT;
    }

    private static final long encoded$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ssize_t encoded
     * }
     */
    public static final long encoded$offset() {
        return encoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ssize_t encoded
     * }
     */
    public static long encoded(MemorySegment struct) {
        return struct.get(encoded$LAYOUT, encoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ssize_t encoded
     * }
     */
    public static void encoded(MemorySegment struct, long fieldValue) {
        struct.set(encoded$LAYOUT, encoded$OFFSET, fieldValue);
    }

    private static final AddressLayout failed_type$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("failed_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct asn_TYPE_descriptor_s *failed_type
     * }
     */
    public static final AddressLayout failed_type$layout() {
        return failed_type$LAYOUT;
    }

    private static final long failed_type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct asn_TYPE_descriptor_s *failed_type
     * }
     */
    public static final long failed_type$offset() {
        return failed_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct asn_TYPE_descriptor_s *failed_type
     * }
     */
    public static MemorySegment failed_type(MemorySegment struct) {
        return struct.get(failed_type$LAYOUT, failed_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct asn_TYPE_descriptor_s *failed_type
     * }
     */
    public static void failed_type(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(failed_type$LAYOUT, failed_type$OFFSET, fieldValue);
    }

    private static final AddressLayout structure_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("structure_ptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *structure_ptr
     * }
     */
    public static final AddressLayout structure_ptr$layout() {
        return structure_ptr$LAYOUT;
    }

    private static final long structure_ptr$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *structure_ptr
     * }
     */
    public static final long structure_ptr$offset() {
        return structure_ptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *structure_ptr
     * }
     */
    public static MemorySegment structure_ptr(MemorySegment struct) {
        return struct.get(structure_ptr$LAYOUT, structure_ptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *structure_ptr
     * }
     */
    public static void structure_ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(structure_ptr$LAYOUT, structure_ptr$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
