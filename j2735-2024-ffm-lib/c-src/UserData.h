/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadUserChargingReportMessage"
 * 	found in "asn/J3217-R-RoadUserChargingReportMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_UserData_H_
#define	_UserData_H_


#include "asn_application.h"

/* Including external dependencies */
#include "DDateTime.h"
#include "OBJECT_IDENTIFIER.h"
#include "TumVehicleId.h"
#include "VehicleTypes.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct VehicleDescription;

/* UserData */
typedef struct UserData {
	DDateTime_t	 timeStamp;
	OBJECT_IDENTIFIER_t	 svcProvID;
	TumVehicleId_t	 vehicleID;
	VehicleTypes_t	 vehicleType;
	struct VehicleDescription	*vehicleDescription;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} UserData_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_UserData;
extern asn_SEQUENCE_specifics_t asn_SPC_UserData_specs_1;
extern asn_TYPE_member_t asn_MBR_UserData_1[5];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "VehicleDescription.h"

#endif	/* _UserData_H_ */
#include "asn_internal.h"
