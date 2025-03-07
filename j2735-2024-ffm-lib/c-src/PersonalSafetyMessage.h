/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "PersonalSafetyMessage"
 * 	found in "asn/J2735-PersonalSafetyMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_PersonalSafetyMessage_H_
#define	_PersonalSafetyMessage_H_


#include "asn_application.h"

/* Including external dependencies */
#include "PersonalDeviceUserType.h"
#include "DSecond.h"
#include "Common_MsgCount.h"
#include "TemporaryID.h"
#include "Position3D.h"
#include "PositionalAccuracy.h"
#include "Velocity.h"
#include "Heading.h"
#include "PersonalDeviceUsageState.h"
#include "PersonalCrossingRequest.h"
#include "PersonalCrossingInProgress.h"
#include "NumberOfParticipantsInCluster.h"
#include "PersonalClusterRadius.h"
#include "PublicSafetyEventResponderWorkerType.h"
#include "PublicSafetyAndRoadWorkerActivity.h"
#include "PublicSafetyDirectingTrafficSubType.h"
#include "PersonalAssistive.h"
#include "UserSizeAndBehaviour.h"
#include "Attachment.h"
#include "AttachmentRadius.h"
#include "AnimalType.h"
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct AccelerationSet4Way;
struct PathHistory;
struct PathPrediction;
struct PropelledInformation;
struct Reg_PersonalSafetyMessage;

/* PersonalSafetyMessage */
typedef struct PersonalSafetyMessage {
	PersonalDeviceUserType_t	 basicType;
	DSecond_t	 secMark;
	Common_MsgCount_t	 msgCnt;
	TemporaryID_t	 id;
	Position3D_t	 position;
	PositionalAccuracy_t	 accuracy;
	Velocity_t	 speed;
	Heading_t	 heading;
	struct AccelerationSet4Way	*accelSet;	/* OPTIONAL */
	struct PathHistory	*pathHistory;	/* OPTIONAL */
	struct PathPrediction	*pathPrediction;	/* OPTIONAL */
	struct PropelledInformation	*propulsion;	/* OPTIONAL */
	PersonalDeviceUsageState_t	*useState;	/* OPTIONAL */
	PersonalCrossingRequest_t	*crossRequest;	/* OPTIONAL */
	PersonalCrossingInProgress_t	*crossState;	/* OPTIONAL */
	NumberOfParticipantsInCluster_t	*clusterSize;	/* OPTIONAL */
	PersonalClusterRadius_t	*clusterRadius;	/* OPTIONAL */
	PublicSafetyEventResponderWorkerType_t	*eventResponderType;	/* OPTIONAL */
	PublicSafetyAndRoadWorkerActivity_t	*activityType;	/* OPTIONAL */
	PublicSafetyDirectingTrafficSubType_t	*activitySubType;	/* OPTIONAL */
	PersonalAssistive_t	*assistType;	/* OPTIONAL */
	UserSizeAndBehaviour_t	*sizing;	/* OPTIONAL */
	Attachment_t	*attachment;	/* OPTIONAL */
	AttachmentRadius_t	*attachmentRadius;	/* OPTIONAL */
	AnimalType_t	*animalType;	/* OPTIONAL */
	struct PersonalSafetyMessage__regional {
		A_SEQUENCE_OF(struct Reg_PersonalSafetyMessage) list;
		
		/* Context for parsing across buffer boundaries */
		asn_struct_ctx_t _asn_ctx;
	} *regional;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} PersonalSafetyMessage_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_PersonalSafetyMessage;
extern asn_SEQUENCE_specifics_t asn_SPC_PersonalSafetyMessage_specs_1;
extern asn_TYPE_member_t asn_MBR_PersonalSafetyMessage_1[26];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "AccelerationSet4Way.h"
#include "PathHistory.h"
#include "PathPrediction.h"
#include "PropelledInformation.h"
#include "RegionalExtension.h"

#endif	/* _PersonalSafetyMessage_H_ */
#include "asn_internal.h"
