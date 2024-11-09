// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct ManeuverSharingAndCoordinatingMessage_PositionOffsetXYZ {
 *     ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetX;
 *     ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetY;
 *     ManeuverSharingAndCoordinatingMessage_ObjectDistance_t *offsetZ;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class ManeuverSharingAndCoordinatingMessage_PositionOffsetXYZ {

    ManeuverSharingAndCoordinatingMessage_PositionOffsetXYZ() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("offsetX"),
        MessageFrame_h.C_LONG.withName("offsetY"),
        MessageFrame_h.C_POINTER.withName("offsetZ"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("ManeuverSharingAndCoordinatingMessage_PositionOffsetXYZ");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong offsetX$LAYOUT = (OfLong)$LAYOUT.select(groupElement("offsetX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetX
     * }
     */
    public static final OfLong offsetX$layout() {
        return offsetX$LAYOUT;
    }

    private static final long offsetX$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetX
     * }
     */
    public static final long offsetX$offset() {
        return offsetX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetX
     * }
     */
    public static long offsetX(MemorySegment struct) {
        return struct.get(offsetX$LAYOUT, offsetX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetX
     * }
     */
    public static void offsetX(MemorySegment struct, long fieldValue) {
        struct.set(offsetX$LAYOUT, offsetX$OFFSET, fieldValue);
    }

    private static final OfLong offsetY$LAYOUT = (OfLong)$LAYOUT.select(groupElement("offsetY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetY
     * }
     */
    public static final OfLong offsetY$layout() {
        return offsetY$LAYOUT;
    }

    private static final long offsetY$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetY
     * }
     */
    public static final long offsetY$offset() {
        return offsetY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetY
     * }
     */
    public static long offsetY(MemorySegment struct) {
        return struct.get(offsetY$LAYOUT, offsetY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t offsetY
     * }
     */
    public static void offsetY(MemorySegment struct, long fieldValue) {
        struct.set(offsetY$LAYOUT, offsetY$OFFSET, fieldValue);
    }

    private static final AddressLayout offsetZ$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("offsetZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t *offsetZ
     * }
     */
    public static final AddressLayout offsetZ$layout() {
        return offsetZ$LAYOUT;
    }

    private static final long offsetZ$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t *offsetZ
     * }
     */
    public static final long offsetZ$offset() {
        return offsetZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t *offsetZ
     * }
     */
    public static MemorySegment offsetZ(MemorySegment struct) {
        return struct.get(offsetZ$LAYOUT, offsetZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ManeuverSharingAndCoordinatingMessage_ObjectDistance_t *offsetZ
     * }
     */
    public static void offsetZ(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(offsetZ$LAYOUT, offsetZ$OFFSET, fieldValue);
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
