/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TravelerInformation"
 * 	found in "asn/J2735-TravelerInformation-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RegionOffsets_H_
#define	_RegionOffsets_H_


#include "asn_application.h"

/* Including external dependencies */
#include "OffsetLL-B16.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* RegionOffsets */
typedef struct RegionOffsets {
	OffsetLL_B16_t	 xOffset;
	OffsetLL_B16_t	 yOffset;
	OffsetLL_B16_t	*zOffset;	/* OPTIONAL */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RegionOffsets_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RegionOffsets;
extern asn_SEQUENCE_specifics_t asn_SPC_RegionOffsets_specs_1;
extern asn_TYPE_member_t asn_MBR_RegionOffsets_1[3];

#ifdef __cplusplus
}
#endif

#endif	/* _RegionOffsets_H_ */
#include "asn_internal.h"
