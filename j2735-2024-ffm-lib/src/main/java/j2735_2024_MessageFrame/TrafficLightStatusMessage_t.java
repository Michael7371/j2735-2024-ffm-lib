// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct TrafficLightStatusMessage {
 *     TrafficLightID_t trafficLightID;
 *     Common_Longitude_t *Long;
 *     Common_Latitude_t *lat;
 *     TrafficLightOperationStatus_t operationStatus;
 *     TrafficLightControllerStatus_t controllerStatus;
 *     TimeInSecond_B16_t cyclecounter;
 *     TimeInSecond_B16_t cycletime;
 *     DDateTime_t currentTime;
 *     TrafficLightStatusList_t trafficLightStatus;
 *     asn_struct_ctx_t _asn_ctx;
 * } TrafficLightStatusMessage_t
 * }
 */
public class TrafficLightStatusMessage_t extends TrafficLightStatusMessage {

    TrafficLightStatusMessage_t() {
        // Should not be called directly
    }
}

