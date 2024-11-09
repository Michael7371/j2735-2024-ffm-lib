/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_FullPositionVector_H_
#define	_FullPositionVector_H_


#include "asn_application.h"

/* Including external dependencies */
#include "Common_Longitude.h"
#include "Common_Latitude.h"
#include "Common_Elevation.h"
#include "Heading.h"
#include "TimeConfidence.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct DDateTime;
struct TransmissionAndSpeed;
struct PositionalAccuracy;
struct PositionConfidenceSet;
struct SpeedandHeadingandThrottleConfidence;

/* FullPositionVector */
typedef struct FullPositionVector {
	struct DDateTime	*utcTime;	/* OPTIONAL */
	Common_Longitude_t	 Long;
	Common_Latitude_t	 lat;
	Common_Elevation_t	*elevation;	/* OPTIONAL */
	Heading_t	*heading;	/* OPTIONAL */
	struct TransmissionAndSpeed	*speed;	/* OPTIONAL */
	struct PositionalAccuracy	*posAccuracy;	/* OPTIONAL */
	TimeConfidence_t	*timeConfidence;	/* OPTIONAL */
	struct PositionConfidenceSet	*posConfidence;	/* OPTIONAL */
	struct SpeedandHeadingandThrottleConfidence	*speedConfidence;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} FullPositionVector_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_FullPositionVector;
extern asn_SEQUENCE_specifics_t asn_SPC_FullPositionVector_specs_1;
extern asn_TYPE_member_t asn_MBR_FullPositionVector_1[10];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "DDateTime.h"
#include "TransmissionAndSpeed.h"
#include "PositionalAccuracy.h"
#include "PositionConfidenceSet.h"
#include "SpeedandHeadingandThrottleConfidence.h"

#endif	/* _FullPositionVector_H_ */
#include "asn_internal.h"