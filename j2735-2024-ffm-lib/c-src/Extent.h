/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Extent_H_
#define	_Extent_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum Extent {
	Extent_useInstantlyOnly	= 0,
	Extent_useFor3meters	= 1,
	Extent_useFor10meters	= 2,
	Extent_useFor50meters	= 3,
	Extent_useFor100meters	= 4,
	Extent_useFor500meters	= 5,
	Extent_useFor1000meters	= 6,
	Extent_useFor5000meters	= 7,
	Extent_useFor10000meters	= 8,
	Extent_useFor50000meters	= 9,
	Extent_useFor100000meters	= 10,
	Extent_useFor500000meters	= 11,
	Extent_useFor1000000meters	= 12,
	Extent_useFor5000000meters	= 13,
	Extent_useFor10000000meters	= 14,
	Extent_forever	= 15
} e_Extent;

/* Extent */
typedef long	 Extent_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_Extent_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_Extent;
extern const asn_INTEGER_specifics_t asn_SPC_Extent_specs_1;
asn_struct_free_f Extent_free;
asn_struct_print_f Extent_print;
asn_constr_check_f Extent_constraint;
ber_type_decoder_f Extent_decode_ber;
der_type_encoder_f Extent_encode_der;
xer_type_decoder_f Extent_decode_xer;
xer_type_encoder_f Extent_encode_xer;
jer_type_encoder_f Extent_encode_jer;
oer_type_decoder_f Extent_decode_oer;
oer_type_encoder_f Extent_encode_oer;
per_type_decoder_f Extent_decode_uper;
per_type_encoder_f Extent_encode_uper;
per_type_decoder_f Extent_decode_aper;
per_type_encoder_f Extent_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _Extent_H_ */
#include "asn_internal.h"
