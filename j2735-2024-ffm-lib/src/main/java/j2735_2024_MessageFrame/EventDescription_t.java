// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct EventDescription {
 *     ITIS_ITIScodes_t typeEvent;
 *     struct EventDescription__description {
 *         struct {
 *             ITIS_ITIScodes_t **array;
 *             int count;
 *             int size;
 *             void (*free)(ITIS_ITIScodes_t *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *description;
 *     Priority_t *priority;
 *     HeadingSlice_t *heading;
 *     Extent_t *extent;
 *     struct EventDescription__regional {
 *         struct {
 *             struct Reg_EventDescription **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_EventDescription *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * } EventDescription_t
 * }
 */
public class EventDescription_t extends EventDescription {

    EventDescription_t() {
        // Should not be called directly
    }
}
