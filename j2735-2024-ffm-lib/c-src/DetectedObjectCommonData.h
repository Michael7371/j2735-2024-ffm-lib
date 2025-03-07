/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "SensorDataSharingMessage"
 * 	found in "asn/J3224-SensorDataSharingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_DetectedObjectCommonData_H_
#define	_DetectedObjectCommonData_H_


#include "asn_application.h"

/* Including external dependencies */
#include "ObjectType.h"
#include "ClassificationConfidence.h"
#include "ObjectID.h"
#include "MeasurementTimeOffset.h"
#include "TimeConfidence.h"
#include "SensorDataSharingMessage_PositionOffsetXYZ.h"
#include "PositionConfidenceSet.h"
#include "Speed.h"
#include "SpeedConfidence.h"
#include "Heading.h"
#include "HeadingConfidence.h"
#include "AccelerationConfidence.h"
#include "YawRateConfidence.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct AccelerationSet4Way;

/* DetectedObjectCommonData */
typedef struct DetectedObjectCommonData {
	ObjectType_t	 objType;
	ClassificationConfidence_t	 objTypeCfd;
	ObjectID_t	 objectID;
	MeasurementTimeOffset_t	 measurementTime;
	TimeConfidence_t	 timeConfidence;
	SensorDataSharingMessage_PositionOffsetXYZ_t	 pos;
	PositionConfidenceSet_t	 posConfidence;
	Speed_t	 speed;
	SpeedConfidence_t	 speedConfidence;
	Speed_t	*speedZ;	/* OPTIONAL */
	SpeedConfidence_t	*speedConfidenceZ;	/* OPTIONAL */
	Heading_t	 heading;
	HeadingConfidence_t	 headingConf;
	struct AccelerationSet4Way	*accel4way;	/* OPTIONAL */
	AccelerationConfidence_t	*accCfdX;	/* OPTIONAL */
	AccelerationConfidence_t	*accCfdY;	/* OPTIONAL */
	AccelerationConfidence_t	*accCfdZ;	/* OPTIONAL */
	YawRateConfidence_t	*accCfdYaw;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} DetectedObjectCommonData_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_DetectedObjectCommonData;
extern asn_SEQUENCE_specifics_t asn_SPC_DetectedObjectCommonData_specs_1;
extern asn_TYPE_member_t asn_MBR_DetectedObjectCommonData_1[18];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "AccelerationSet4Way.h"

#endif	/* _DetectedObjectCommonData_H_ */
#include "asn_internal.h"
