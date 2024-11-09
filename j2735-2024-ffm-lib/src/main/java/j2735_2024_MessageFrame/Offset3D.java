// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct Offset3D {
 *     LatOffset_t lat_offset;
 *     LongOffset_t long_offset;
 *     ElevOffset_t *elev_offset;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class Offset3D {

    Offset3D() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("lat_offset"),
        MessageFrame_h.C_LONG.withName("long_offset"),
        MessageFrame_h.C_POINTER.withName("elev_offset"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("Offset3D");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong lat_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lat_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LatOffset_t lat_offset
     * }
     */
    public static final OfLong lat_offset$layout() {
        return lat_offset$LAYOUT;
    }

    private static final long lat_offset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LatOffset_t lat_offset
     * }
     */
    public static final long lat_offset$offset() {
        return lat_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LatOffset_t lat_offset
     * }
     */
    public static long lat_offset(MemorySegment struct) {
        return struct.get(lat_offset$LAYOUT, lat_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LatOffset_t lat_offset
     * }
     */
    public static void lat_offset(MemorySegment struct, long fieldValue) {
        struct.set(lat_offset$LAYOUT, lat_offset$OFFSET, fieldValue);
    }

    private static final OfLong long_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("long_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LongOffset_t long_offset
     * }
     */
    public static final OfLong long_offset$layout() {
        return long_offset$LAYOUT;
    }

    private static final long long_offset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LongOffset_t long_offset
     * }
     */
    public static final long long_offset$offset() {
        return long_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LongOffset_t long_offset
     * }
     */
    public static long long_offset(MemorySegment struct) {
        return struct.get(long_offset$LAYOUT, long_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LongOffset_t long_offset
     * }
     */
    public static void long_offset(MemorySegment struct, long fieldValue) {
        struct.set(long_offset$LAYOUT, long_offset$OFFSET, fieldValue);
    }

    private static final AddressLayout elev_offset$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("elev_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ElevOffset_t *elev_offset
     * }
     */
    public static final AddressLayout elev_offset$layout() {
        return elev_offset$LAYOUT;
    }

    private static final long elev_offset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ElevOffset_t *elev_offset
     * }
     */
    public static final long elev_offset$offset() {
        return elev_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ElevOffset_t *elev_offset
     * }
     */
    public static MemorySegment elev_offset(MemorySegment struct) {
        return struct.get(elev_offset$LAYOUT, elev_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ElevOffset_t *elev_offset
     * }
     */
    public static void elev_offset(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(elev_offset$LAYOUT, elev_offset$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 24;

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
