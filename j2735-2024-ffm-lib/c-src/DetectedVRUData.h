/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "SensorDataSharingMessage"
 * 	found in "asn/J3224-SensorDataSharingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_DetectedVRUData_H_
#define	_DetectedVRUData_H_


#include "asn_application.h"

/* Including external dependencies */
#include "PersonalDeviceUserType.h"
#include "Attachment.h"
#include "AttachmentRadius.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct PropelledInformation;

/* DetectedVRUData */
typedef struct DetectedVRUData {
	PersonalDeviceUserType_t	*basicType;	/* OPTIONAL */
	struct PropelledInformation	*propulsion;	/* OPTIONAL */
	Attachment_t	*attachment;	/* OPTIONAL */
	AttachmentRadius_t	*radius;	/* OPTIONAL */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} DetectedVRUData_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_DetectedVRUData;
extern asn_SEQUENCE_specifics_t asn_SPC_DetectedVRUData_specs_1;
extern asn_TYPE_member_t asn_MBR_DetectedVRUData_1[4];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "PropelledInformation.h"

#endif	/* _DetectedVRUData_H_ */
#include "asn_internal.h"
