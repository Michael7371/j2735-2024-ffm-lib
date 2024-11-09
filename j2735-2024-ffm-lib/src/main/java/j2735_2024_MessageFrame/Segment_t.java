// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct Segment {
 *     OBJECT_IDENTIFIER_t segmentID;
 *     struct Segment__chargingSegment {
 *         struct {
 *             struct TollAdvertisementMessage **array;
 *             int count;
 *             int size;
 *             void (*free)(struct TollAdvertisementMessage *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } chargingSegment;
 *     struct ChargingUnits *chargingUnits;
 *     asn_struct_ctx_t _asn_ctx;
 * } Segment_t
 * }
 */
public class Segment_t extends Segment {

    Segment_t() {
        // Should not be called directly
    }
}
