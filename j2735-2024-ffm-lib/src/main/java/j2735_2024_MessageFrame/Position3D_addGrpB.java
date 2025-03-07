// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct Position3D_addGrpB {
 *     LatitudeDMS2_t latitude;
 *     LongitudeDMS2_t longitude;
 *     AddGrpB_Elevation_t elevation;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class Position3D_addGrpB {

    Position3D_addGrpB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        LatitudeDMS2.layout().withName("latitude"),
        LongitudeDMS2.layout().withName("longitude"),
        MessageFrame_h.C_LONG.withName("elevation"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("Position3D_addGrpB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout latitude$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("latitude"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t latitude
     * }
     */
    public static final GroupLayout latitude$layout() {
        return latitude$LAYOUT;
    }

    private static final long latitude$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t latitude
     * }
     */
    public static final long latitude$offset() {
        return latitude$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t latitude
     * }
     */
    public static MemorySegment latitude(MemorySegment struct) {
        return struct.asSlice(latitude$OFFSET, latitude$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LatitudeDMS2_t latitude
     * }
     */
    public static void latitude(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, latitude$OFFSET, latitude$LAYOUT.byteSize());
    }

    private static final GroupLayout longitude$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("longitude"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t longitude
     * }
     */
    public static final GroupLayout longitude$layout() {
        return longitude$LAYOUT;
    }

    private static final long longitude$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t longitude
     * }
     */
    public static final long longitude$offset() {
        return longitude$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t longitude
     * }
     */
    public static MemorySegment longitude(MemorySegment struct) {
        return struct.asSlice(longitude$OFFSET, longitude$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LongitudeDMS2_t longitude
     * }
     */
    public static void longitude(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, longitude$OFFSET, longitude$LAYOUT.byteSize());
    }

    private static final OfLong elevation$LAYOUT = (OfLong)$LAYOUT.select(groupElement("elevation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AddGrpB_Elevation_t elevation
     * }
     */
    public static final OfLong elevation$layout() {
        return elevation$LAYOUT;
    }

    private static final long elevation$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AddGrpB_Elevation_t elevation
     * }
     */
    public static final long elevation$offset() {
        return elevation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AddGrpB_Elevation_t elevation
     * }
     */
    public static long elevation(MemorySegment struct) {
        return struct.get(elevation$LAYOUT, elevation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AddGrpB_Elevation_t elevation
     * }
     */
    public static void elevation(MemorySegment struct, long fieldValue) {
        struct.set(elevation$LAYOUT, elevation$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 104;

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

