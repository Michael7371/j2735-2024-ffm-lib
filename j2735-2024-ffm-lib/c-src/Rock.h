/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Rock_H_
#define	_Rock_H_


#include "asn_application.h"

/* Including external dependencies */
#include "RockType.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Rock */
typedef struct Rock {
	RockType_t	 type;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} Rock_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Rock;
extern asn_SEQUENCE_specifics_t asn_SPC_Rock_specs_1;
extern asn_TYPE_member_t asn_MBR_Rock_1[1];

#ifdef __cplusplus
}
#endif

#endif	/* _Rock_H_ */
#include "asn_internal.h"