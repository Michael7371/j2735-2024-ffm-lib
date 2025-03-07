/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RelativePosition3d_H_
#define	_RelativePosition3d_H_


#include "asn_application.h"

/* Including external dependencies */
#include "Int2Signed.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* RelativePosition3d */
typedef struct RelativePosition3d {
	Int2Signed_t	 longitude;
	Int2Signed_t	 latitude;
	Int2Signed_t	*altitude;	/* OPTIONAL */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RelativePosition3d_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RelativePosition3d;
extern asn_SEQUENCE_specifics_t asn_SPC_RelativePosition3d_specs_1;
extern asn_TYPE_member_t asn_MBR_RelativePosition3d_1[3];

#ifdef __cplusplus
}
#endif

#endif	/* _RelativePosition3d_H_ */
#include "asn_internal.h"
