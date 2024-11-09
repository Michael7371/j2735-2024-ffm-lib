// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct SignalRequestMessage {
 *     MinuteOfTheYear_t *timeStamp;
 *     DSecond_t second;
 *     Common_MsgCount_t *sequenceNumber;
 *     struct SignalRequestList *requests;
 *     RequestorDescription_t requestor;
 *     struct SignalRequestMessage__regional {
 *         struct {
 *             struct Reg_SignalRequestMessage **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_SignalRequestMessage *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * } SignalRequestMessage_t
 * }
 */
public class SignalRequestMessage_t extends SignalRequestMessage {

    SignalRequestMessage_t() {
        // Should not be called directly
    }
}
