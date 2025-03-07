/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataConfig"
 * 	found in "asn/J2945-C-ProbeDataConfig-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CfgKinematicEvents_H_
#define	_CfgKinematicEvents_H_


#include "asn_application.h"

/* Including external dependencies */
#include "CfgEvents.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct CfgHysteresis;

/* CfgKinematicEvents */
typedef struct CfgKinematicEvents {
	CfgEvents_t	 events;
	struct CfgHysteresis	*hysteresis;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} CfgKinematicEvents_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_CfgKinematicEvents;
extern asn_SEQUENCE_specifics_t asn_SPC_CfgKinematicEvents_specs_1;
extern asn_TYPE_member_t asn_MBR_CfgKinematicEvents_1[2];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "CfgHysteresis.h"

#endif	/* _CfgKinematicEvents_H_ */
#include "asn_internal.h"
