/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_SchoolBusJ2945Slash1C_H_
#define	_SchoolBusJ2945Slash1C_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BOOLEAN.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* SchoolBusJ2945Slash1C */
typedef struct SchoolBusJ2945Slash1C {
	BOOLEAN_t	 flashingAmberLights;
	BOOLEAN_t	 flashingRedLights;
	BOOLEAN_t	*studentsCrossingFront;	/* OPTIONAL */
	BOOLEAN_t	*studentsCrossingBehind;	/* OPTIONAL */
	BOOLEAN_t	*studentsLoading;	/* OPTIONAL */
	BOOLEAN_t	*studentsUnloading;	/* OPTIONAL */
	BOOLEAN_t	*wheelchairLiftInUse;	/* OPTIONAL */
	BOOLEAN_t	*emergencyExitOpen;	/* OPTIONAL */
	BOOLEAN_t	*emergencyRequestMedical;	/* OPTIONAL */
	BOOLEAN_t	*emergencyRequestFire;	/* OPTIONAL */
	BOOLEAN_t	*emergencyRequestPolice;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} SchoolBusJ2945Slash1C_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_SchoolBusJ2945Slash1C;
extern asn_SEQUENCE_specifics_t asn_SPC_SchoolBusJ2945Slash1C_specs_1;
extern asn_TYPE_member_t asn_MBR_SchoolBusJ2945Slash1C_1[11];

#ifdef __cplusplus
}
#endif

#endif	/* _SchoolBusJ2945Slash1C_H_ */
#include "asn_internal.h"
