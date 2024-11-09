// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct CfgRoadSignTypes {
 *     BOOLEAN_t *whiteOnGreen;
 *     BOOLEAN_t *blackOnYellow;
 *     BOOLEAN_t *blackOnOrange;
 *     BOOLEAN_t *whiteOnRed;
 *     BOOLEAN_t *blackOnWhite;
 *     BOOLEAN_t *octagon;
 *     BOOLEAN_t *eqlatTriangle;
 *     BOOLEAN_t *circle;
 *     BOOLEAN_t *pennant;
 *     BOOLEAN_t *pentagon;
 *     BOOLEAN_t *crossbuck;
 *     BOOLEAN_t *diamond;
 *     BOOLEAN_t *trapezoid;
 *     BOOLEAN_t *other;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class CfgRoadSignTypes {

    CfgRoadSignTypes() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("whiteOnGreen"),
        MessageFrame_h.C_POINTER.withName("blackOnYellow"),
        MessageFrame_h.C_POINTER.withName("blackOnOrange"),
        MessageFrame_h.C_POINTER.withName("whiteOnRed"),
        MessageFrame_h.C_POINTER.withName("blackOnWhite"),
        MessageFrame_h.C_POINTER.withName("octagon"),
        MessageFrame_h.C_POINTER.withName("eqlatTriangle"),
        MessageFrame_h.C_POINTER.withName("circle"),
        MessageFrame_h.C_POINTER.withName("pennant"),
        MessageFrame_h.C_POINTER.withName("pentagon"),
        MessageFrame_h.C_POINTER.withName("crossbuck"),
        MessageFrame_h.C_POINTER.withName("diamond"),
        MessageFrame_h.C_POINTER.withName("trapezoid"),
        MessageFrame_h.C_POINTER.withName("other"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("CfgRoadSignTypes");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout whiteOnGreen$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("whiteOnGreen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnGreen
     * }
     */
    public static final AddressLayout whiteOnGreen$layout() {
        return whiteOnGreen$LAYOUT;
    }

    private static final long whiteOnGreen$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnGreen
     * }
     */
    public static final long whiteOnGreen$offset() {
        return whiteOnGreen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnGreen
     * }
     */
    public static MemorySegment whiteOnGreen(MemorySegment struct) {
        return struct.get(whiteOnGreen$LAYOUT, whiteOnGreen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnGreen
     * }
     */
    public static void whiteOnGreen(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(whiteOnGreen$LAYOUT, whiteOnGreen$OFFSET, fieldValue);
    }

    private static final AddressLayout blackOnYellow$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("blackOnYellow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnYellow
     * }
     */
    public static final AddressLayout blackOnYellow$layout() {
        return blackOnYellow$LAYOUT;
    }

    private static final long blackOnYellow$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnYellow
     * }
     */
    public static final long blackOnYellow$offset() {
        return blackOnYellow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnYellow
     * }
     */
    public static MemorySegment blackOnYellow(MemorySegment struct) {
        return struct.get(blackOnYellow$LAYOUT, blackOnYellow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnYellow
     * }
     */
    public static void blackOnYellow(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(blackOnYellow$LAYOUT, blackOnYellow$OFFSET, fieldValue);
    }

    private static final AddressLayout blackOnOrange$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("blackOnOrange"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnOrange
     * }
     */
    public static final AddressLayout blackOnOrange$layout() {
        return blackOnOrange$LAYOUT;
    }

    private static final long blackOnOrange$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnOrange
     * }
     */
    public static final long blackOnOrange$offset() {
        return blackOnOrange$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnOrange
     * }
     */
    public static MemorySegment blackOnOrange(MemorySegment struct) {
        return struct.get(blackOnOrange$LAYOUT, blackOnOrange$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnOrange
     * }
     */
    public static void blackOnOrange(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(blackOnOrange$LAYOUT, blackOnOrange$OFFSET, fieldValue);
    }

    private static final AddressLayout whiteOnRed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("whiteOnRed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnRed
     * }
     */
    public static final AddressLayout whiteOnRed$layout() {
        return whiteOnRed$LAYOUT;
    }

    private static final long whiteOnRed$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnRed
     * }
     */
    public static final long whiteOnRed$offset() {
        return whiteOnRed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnRed
     * }
     */
    public static MemorySegment whiteOnRed(MemorySegment struct) {
        return struct.get(whiteOnRed$LAYOUT, whiteOnRed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *whiteOnRed
     * }
     */
    public static void whiteOnRed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(whiteOnRed$LAYOUT, whiteOnRed$OFFSET, fieldValue);
    }

    private static final AddressLayout blackOnWhite$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("blackOnWhite"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnWhite
     * }
     */
    public static final AddressLayout blackOnWhite$layout() {
        return blackOnWhite$LAYOUT;
    }

    private static final long blackOnWhite$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnWhite
     * }
     */
    public static final long blackOnWhite$offset() {
        return blackOnWhite$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnWhite
     * }
     */
    public static MemorySegment blackOnWhite(MemorySegment struct) {
        return struct.get(blackOnWhite$LAYOUT, blackOnWhite$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *blackOnWhite
     * }
     */
    public static void blackOnWhite(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(blackOnWhite$LAYOUT, blackOnWhite$OFFSET, fieldValue);
    }

    private static final AddressLayout octagon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("octagon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *octagon
     * }
     */
    public static final AddressLayout octagon$layout() {
        return octagon$LAYOUT;
    }

    private static final long octagon$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *octagon
     * }
     */
    public static final long octagon$offset() {
        return octagon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *octagon
     * }
     */
    public static MemorySegment octagon(MemorySegment struct) {
        return struct.get(octagon$LAYOUT, octagon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *octagon
     * }
     */
    public static void octagon(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(octagon$LAYOUT, octagon$OFFSET, fieldValue);
    }

    private static final AddressLayout eqlatTriangle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("eqlatTriangle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *eqlatTriangle
     * }
     */
    public static final AddressLayout eqlatTriangle$layout() {
        return eqlatTriangle$LAYOUT;
    }

    private static final long eqlatTriangle$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *eqlatTriangle
     * }
     */
    public static final long eqlatTriangle$offset() {
        return eqlatTriangle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *eqlatTriangle
     * }
     */
    public static MemorySegment eqlatTriangle(MemorySegment struct) {
        return struct.get(eqlatTriangle$LAYOUT, eqlatTriangle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *eqlatTriangle
     * }
     */
    public static void eqlatTriangle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(eqlatTriangle$LAYOUT, eqlatTriangle$OFFSET, fieldValue);
    }

    private static final AddressLayout circle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("circle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *circle
     * }
     */
    public static final AddressLayout circle$layout() {
        return circle$LAYOUT;
    }

    private static final long circle$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *circle
     * }
     */
    public static final long circle$offset() {
        return circle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *circle
     * }
     */
    public static MemorySegment circle(MemorySegment struct) {
        return struct.get(circle$LAYOUT, circle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *circle
     * }
     */
    public static void circle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(circle$LAYOUT, circle$OFFSET, fieldValue);
    }

    private static final AddressLayout pennant$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pennant"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pennant
     * }
     */
    public static final AddressLayout pennant$layout() {
        return pennant$LAYOUT;
    }

    private static final long pennant$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pennant
     * }
     */
    public static final long pennant$offset() {
        return pennant$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pennant
     * }
     */
    public static MemorySegment pennant(MemorySegment struct) {
        return struct.get(pennant$LAYOUT, pennant$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pennant
     * }
     */
    public static void pennant(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pennant$LAYOUT, pennant$OFFSET, fieldValue);
    }

    private static final AddressLayout pentagon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pentagon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pentagon
     * }
     */
    public static final AddressLayout pentagon$layout() {
        return pentagon$LAYOUT;
    }

    private static final long pentagon$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pentagon
     * }
     */
    public static final long pentagon$offset() {
        return pentagon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pentagon
     * }
     */
    public static MemorySegment pentagon(MemorySegment struct) {
        return struct.get(pentagon$LAYOUT, pentagon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *pentagon
     * }
     */
    public static void pentagon(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pentagon$LAYOUT, pentagon$OFFSET, fieldValue);
    }

    private static final AddressLayout crossbuck$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("crossbuck"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *crossbuck
     * }
     */
    public static final AddressLayout crossbuck$layout() {
        return crossbuck$LAYOUT;
    }

    private static final long crossbuck$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *crossbuck
     * }
     */
    public static final long crossbuck$offset() {
        return crossbuck$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *crossbuck
     * }
     */
    public static MemorySegment crossbuck(MemorySegment struct) {
        return struct.get(crossbuck$LAYOUT, crossbuck$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *crossbuck
     * }
     */
    public static void crossbuck(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(crossbuck$LAYOUT, crossbuck$OFFSET, fieldValue);
    }

    private static final AddressLayout diamond$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("diamond"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *diamond
     * }
     */
    public static final AddressLayout diamond$layout() {
        return diamond$LAYOUT;
    }

    private static final long diamond$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *diamond
     * }
     */
    public static final long diamond$offset() {
        return diamond$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *diamond
     * }
     */
    public static MemorySegment diamond(MemorySegment struct) {
        return struct.get(diamond$LAYOUT, diamond$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *diamond
     * }
     */
    public static void diamond(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(diamond$LAYOUT, diamond$OFFSET, fieldValue);
    }

    private static final AddressLayout trapezoid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("trapezoid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *trapezoid
     * }
     */
    public static final AddressLayout trapezoid$layout() {
        return trapezoid$LAYOUT;
    }

    private static final long trapezoid$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *trapezoid
     * }
     */
    public static final long trapezoid$offset() {
        return trapezoid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *trapezoid
     * }
     */
    public static MemorySegment trapezoid(MemorySegment struct) {
        return struct.get(trapezoid$LAYOUT, trapezoid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *trapezoid
     * }
     */
    public static void trapezoid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(trapezoid$LAYOUT, trapezoid$OFFSET, fieldValue);
    }

    private static final AddressLayout other$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("other"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN_t *other
     * }
     */
    public static final AddressLayout other$layout() {
        return other$LAYOUT;
    }

    private static final long other$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN_t *other
     * }
     */
    public static final long other$offset() {
        return other$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *other
     * }
     */
    public static MemorySegment other(MemorySegment struct) {
        return struct.get(other$LAYOUT, other$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN_t *other
     * }
     */
    public static void other(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(other$LAYOUT, other$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 112;

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
