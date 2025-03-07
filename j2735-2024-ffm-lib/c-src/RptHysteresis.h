/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataReport"
 * 	found in "asn/J2945-C-ProbeDataReport-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RptHysteresis_H_
#define	_RptHysteresis_H_


#include "asn_application.h"

/* Including external dependencies */
#include "DTime.h"
#include "Position3D.h"
#include "RptVelocity.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct PositionalAccuracy;

/* RptHysteresis */
typedef struct RptHysteresis {
	DTime_t	 time;
	Position3D_t	 position;
	struct PositionalAccuracy	*positionalAccuracy;	/* OPTIONAL */
	RptVelocity_t	 velocity;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RptHysteresis_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RptHysteresis;
extern asn_SEQUENCE_specifics_t asn_SPC_RptHysteresis_specs_1;
extern asn_TYPE_member_t asn_MBR_RptHysteresis_1[4];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "PositionalAccuracy.h"

#endif	/* _RptHysteresis_H_ */
#include "asn_internal.h"
