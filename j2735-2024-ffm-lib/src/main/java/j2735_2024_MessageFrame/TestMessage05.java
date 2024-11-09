// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TestMessage05 {
 *     struct Header *header;
 *     struct Reg_TestMessage05 *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TestMessage05 {

    TestMessage05() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("header"),
        MessageFrame_h.C_POINTER.withName("regional"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TestMessage05");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout header$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct Header *header
     * }
     */
    public static final AddressLayout header$layout() {
        return header$LAYOUT;
    }

    private static final long header$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct Header *header
     * }
     */
    public static final long header$offset() {
        return header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct Header *header
     * }
     */
    public static MemorySegment header(MemorySegment struct) {
        return struct.get(header$LAYOUT, header$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct Header *header
     * }
     */
    public static void header(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(header$LAYOUT, header$OFFSET, fieldValue);
    }

    private static final AddressLayout regional$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("regional"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct Reg_TestMessage05 *regional
     * }
     */
    public static final AddressLayout regional$layout() {
        return regional$LAYOUT;
    }

    private static final long regional$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct Reg_TestMessage05 *regional
     * }
     */
    public static final long regional$offset() {
        return regional$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct Reg_TestMessage05 *regional
     * }
     */
    public static MemorySegment regional(MemorySegment struct) {
        return struct.get(regional$LAYOUT, regional$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct Reg_TestMessage05 *regional
     * }
     */
    public static void regional(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(regional$LAYOUT, regional$OFFSET, fieldValue);
    }

    private static final GroupLayout _asn_ctx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_asn_ctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final GroupLayout _asn_ctx$layout() {
        return _asn_ctx$LAYOUT;
    }

    private static final long _asn_ctx$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final long _asn_ctx$offset() {
        return _asn_ctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static MemorySegment _asn_ctx(MemorySegment struct) {
        return struct.asSlice(_asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static void _asn_ctx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
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
