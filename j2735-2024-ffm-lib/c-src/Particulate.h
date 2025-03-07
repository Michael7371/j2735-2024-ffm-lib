/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Particulate_H_
#define	_Particulate_H_


#include "asn_application.h"

/* Including external dependencies */
#include "EmissionUnit.h"
#include "NativeInteger.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Particulate */
typedef struct Particulate {
	EmissionUnit_t	 unitType;
	long	 value;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} Particulate_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Particulate;
extern asn_SEQUENCE_specifics_t asn_SPC_Particulate_specs_1;
extern asn_TYPE_member_t asn_MBR_Particulate_1[2];

#ifdef __cplusplus
}
#endif

#endif	/* _Particulate_H_ */
#include "asn_internal.h"
