// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct Node_LLdms_80b {
 *     LongitudeDMS2_t lon;
 *     LatitudeDMS2_t lat;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class Node_LLdms_80b {

    Node_LLdms_80b() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        LongitudeDMS2.layout().withName("lon"),
        LatitudeDMS2.layout().withName("lat"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("Node_LLdms_80b");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout lon$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t lon
     * }
     */
    public static final GroupLayout lon$layout() {
        return lon$LAYOUT;
    }

    private static final long lon$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t lon
     * }
     */
    public static final long lon$offset() {
        return lon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t lon
     * }
     */
    public static MemorySegment lon(MemorySegment struct) {
        return struct.asSlice(lon$OFFSET, lon$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t lon
     * }
     */
    public static void lon(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lon$OFFSET, lon$LAYOUT.byteSize());
    }

    private static final GroupLayout lat$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t lat
     * }
     */
    public static final GroupLayout lat$layout() {
        return lat$LAYOUT;
    }

    private static final long lat$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t lat
     * }
     */
    public static final long lat$offset() {
        return lat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t lat
     * }
     */
    public static MemorySegment lat(MemorySegment struct) {
        return struct.asSlice(lat$OFFSET, lat$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t lat
     * }
     */
    public static void lat(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lat$OFFSET, lat$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 96;

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
