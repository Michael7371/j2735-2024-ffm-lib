// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct VehicleSizeConfidence {
 *     SizeValueConfidence_t vehicleWidthConfidence;
 *     SizeValueConfidence_t vehicleLengthConfidence;
 *     SizeValueConfidence_t *vehicleHeightConfidence;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class VehicleSizeConfidence {

    VehicleSizeConfidence() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("vehicleWidthConfidence"),
        MessageFrame_h.C_LONG.withName("vehicleLengthConfidence"),
        MessageFrame_h.C_POINTER.withName("vehicleHeightConfidence"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("VehicleSizeConfidence");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong vehicleWidthConfidence$LAYOUT = (OfLong)$LAYOUT.select(groupElement("vehicleWidthConfidence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleWidthConfidence
     * }
     */
    public static final OfLong vehicleWidthConfidence$layout() {
        return vehicleWidthConfidence$LAYOUT;
    }

    private static final long vehicleWidthConfidence$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleWidthConfidence
     * }
     */
    public static final long vehicleWidthConfidence$offset() {
        return vehicleWidthConfidence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleWidthConfidence
     * }
     */
    public static long vehicleWidthConfidence(MemorySegment struct) {
        return struct.get(vehicleWidthConfidence$LAYOUT, vehicleWidthConfidence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleWidthConfidence
     * }
     */
    public static void vehicleWidthConfidence(MemorySegment struct, long fieldValue) {
        struct.set(vehicleWidthConfidence$LAYOUT, vehicleWidthConfidence$OFFSET, fieldValue);
    }

    private static final OfLong vehicleLengthConfidence$LAYOUT = (OfLong)$LAYOUT.select(groupElement("vehicleLengthConfidence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleLengthConfidence
     * }
     */
    public static final OfLong vehicleLengthConfidence$layout() {
        return vehicleLengthConfidence$LAYOUT;
    }

    private static final long vehicleLengthConfidence$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleLengthConfidence
     * }
     */
    public static final long vehicleLengthConfidence$offset() {
        return vehicleLengthConfidence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleLengthConfidence
     * }
     */
    public static long vehicleLengthConfidence(MemorySegment struct) {
        return struct.get(vehicleLengthConfidence$LAYOUT, vehicleLengthConfidence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t vehicleLengthConfidence
     * }
     */
    public static void vehicleLengthConfidence(MemorySegment struct, long fieldValue) {
        struct.set(vehicleLengthConfidence$LAYOUT, vehicleLengthConfidence$OFFSET, fieldValue);
    }

    private static final AddressLayout vehicleHeightConfidence$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("vehicleHeightConfidence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t *vehicleHeightConfidence
     * }
     */
    public static final AddressLayout vehicleHeightConfidence$layout() {
        return vehicleHeightConfidence$LAYOUT;
    }

    private static final long vehicleHeightConfidence$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t *vehicleHeightConfidence
     * }
     */
    public static final long vehicleHeightConfidence$offset() {
        return vehicleHeightConfidence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t *vehicleHeightConfidence
     * }
     */
    public static MemorySegment vehicleHeightConfidence(MemorySegment struct) {
        return struct.get(vehicleHeightConfidence$LAYOUT, vehicleHeightConfidence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SizeValueConfidence_t *vehicleHeightConfidence
     * }
     */
    public static void vehicleHeightConfidence(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vehicleHeightConfidence$LAYOUT, vehicleHeightConfidence$OFFSET, fieldValue);
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

