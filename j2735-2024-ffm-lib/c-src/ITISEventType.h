/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ITISEventType_H_
#define	_ITISEventType_H_


#include "asn_application.h"

/* Including external dependencies */
#include "TrafficConditions.h"
#include "AccidentsAndIncidents.h"
#include "Closures.h"
#include "Roadwork.h"
#include "Obstruction.h"
#include "DelayStatusCancellation.h"
#include "UnusualDriving.h"
#include "MobileSituation.h"
#include "DeviceStatus.h"
#include "RestrictionClass.h"
#include "IncidentResponseStatus.h"
#include "Disasters.h"
#include "Disturbances.h"
#include "SportingEvents.h"
#include "SpecialEvents.h"
#include "ParkingInformation.h"
#include "SystemInformation.h"
#include "WeatherConditions.h"
#include "Precipitation.h"
#include "Winds.h"
#include "VisibilityAndAirQuality.h"
#include "Temperature.h"
#include "PavementConditions.h"
#include "WinterDrivingRestrictions.h"
#include "WinterDrivingIndex.h"
#include "SuggestionAdvice.h"
#include "WarningAdvice.h"
#include "AdviceInstructionsRecommendations.h"
#include "AdviceInstructionsMandatory.h"
#include "LaneRoadway.h"
#include "AlternateRoute.h"
#include "TransitMode.h"
#include "J2540ITIS_VehicleGroupAffected.h"
#include "TravelerGroupAffected.h"
#include "J2540ITIS_ResponderGroupAffected.h"
#include "J2540ITIS_IncidentResponseEquipment.h"
#include "TransitOperations.h"
#include "RegulatoryAndWarningSigns.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum ITISEventType_PR {
	ITISEventType_PR_NOTHING,	/* No components present */
	ITISEventType_PR_trafficConditions,
	ITISEventType_PR_accidentsAndIncidents,
	ITISEventType_PR_closures,
	ITISEventType_PR_roadwork,
	ITISEventType_PR_obstruction,
	ITISEventType_PR_delayStatusCancellation,
	ITISEventType_PR_unusualDriving,
	ITISEventType_PR_mobileSituation,
	ITISEventType_PR_deviceStatus,
	ITISEventType_PR_restrictionClass,
	ITISEventType_PR_incidentResponseStatus,
	ITISEventType_PR_disasters,
	ITISEventType_PR_disturbances,
	ITISEventType_PR_sportingEvents,
	ITISEventType_PR_specialEvents,
	ITISEventType_PR_parkingInformation,
	ITISEventType_PR_systemInformation,
	ITISEventType_PR_weatherConditions,
	ITISEventType_PR_precipitation,
	ITISEventType_PR_winds,
	ITISEventType_PR_visibilityAndAirQuality,
	ITISEventType_PR_temperature,
	ITISEventType_PR_pavementConditions,
	ITISEventType_PR_winterDrivingRestrictions,
	ITISEventType_PR_winterDrivingIndex,
	ITISEventType_PR_suggestionAdvice,
	ITISEventType_PR_warningAdvice,
	ITISEventType_PR_adviceInstructionsRecommendations,
	ITISEventType_PR_adviceInstructionsMandatory,
	ITISEventType_PR_laneRoadway,
	ITISEventType_PR_alternateRoute,
	ITISEventType_PR_transitMode,
	ITISEventType_PR_vehicleGroupAffected,
	ITISEventType_PR_travelerGroupAffected,
	ITISEventType_PR_responderGroupAffected,
	ITISEventType_PR_incidentResponseEquipment,
	ITISEventType_PR_transitOperations,
	ITISEventType_PR_regulatorySigns
} ITISEventType_PR;

/* ITISEventType */
typedef struct ITISEventType {
	ITISEventType_PR present;
	union ITISEventType_u {
		TrafficConditions_t	 trafficConditions;
		AccidentsAndIncidents_t	 accidentsAndIncidents;
		Closures_t	 closures;
		Roadwork_t	 roadwork;
		Obstruction_t	 obstruction;
		DelayStatusCancellation_t	 delayStatusCancellation;
		UnusualDriving_t	 unusualDriving;
		MobileSituation_t	 mobileSituation;
		DeviceStatus_t	 deviceStatus;
		RestrictionClass_t	 restrictionClass;
		IncidentResponseStatus_t	 incidentResponseStatus;
		Disasters_t	 disasters;
		Disturbances_t	 disturbances;
		SportingEvents_t	 sportingEvents;
		SpecialEvents_t	 specialEvents;
		ParkingInformation_t	 parkingInformation;
		SystemInformation_t	 systemInformation;
		WeatherConditions_t	 weatherConditions;
		Precipitation_t	 precipitation;
		Winds_t	 winds;
		VisibilityAndAirQuality_t	 visibilityAndAirQuality;
		Temperature_t	 temperature;
		PavementConditions_t	 pavementConditions;
		WinterDrivingRestrictions_t	 winterDrivingRestrictions;
		WinterDrivingIndex_t	 winterDrivingIndex;
		SuggestionAdvice_t	 suggestionAdvice;
		WarningAdvice_t	 warningAdvice;
		AdviceInstructionsRecommendations_t	 adviceInstructionsRecommendations;
		AdviceInstructionsMandatory_t	 adviceInstructionsMandatory;
		LaneRoadway_t	 laneRoadway;
		AlternateRoute_t	 alternateRoute;
		TransitMode_t	 transitMode;
		J2540ITIS_VehicleGroupAffected_t	 vehicleGroupAffected;
		TravelerGroupAffected_t	 travelerGroupAffected;
		J2540ITIS_ResponderGroupAffected_t	 responderGroupAffected;
		J2540ITIS_IncidentResponseEquipment_t	 incidentResponseEquipment;
		TransitOperations_t	 transitOperations;
		RegulatoryAndWarningSigns_t	 regulatorySigns;
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ITISEventType_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ITISEventType;

#ifdef __cplusplus
}
#endif

#endif	/* _ITISEventType_H_ */
#include "asn_internal.h"
