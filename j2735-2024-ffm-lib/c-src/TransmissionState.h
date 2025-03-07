/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TransmissionState_H_
#define	_TransmissionState_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum TransmissionState {
	TransmissionState_neutral	= 0,
	TransmissionState_park	= 1,
	TransmissionState_forwardGears	= 2,
	TransmissionState_reverseGears	= 3,
	TransmissionState_reserved1	= 4,
	TransmissionState_reserved2	= 5,
	TransmissionState_reserved3	= 6,
	TransmissionState_unavailable	= 7
} e_TransmissionState;

/* TransmissionState */
typedef long	 TransmissionState_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_TransmissionState_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_TransmissionState;
extern const asn_INTEGER_specifics_t asn_SPC_TransmissionState_specs_1;
asn_struct_free_f TransmissionState_free;
asn_struct_print_f TransmissionState_print;
asn_constr_check_f TransmissionState_constraint;
ber_type_decoder_f TransmissionState_decode_ber;
der_type_encoder_f TransmissionState_encode_der;
xer_type_decoder_f TransmissionState_decode_xer;
xer_type_encoder_f TransmissionState_encode_xer;
jer_type_encoder_f TransmissionState_encode_jer;
oer_type_decoder_f TransmissionState_decode_oer;
oer_type_encoder_f TransmissionState_encode_oer;
per_type_decoder_f TransmissionState_decode_uper;
per_type_encoder_f TransmissionState_encode_uper;
per_type_decoder_f TransmissionState_decode_aper;
per_type_encoder_f TransmissionState_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _TransmissionState_H_ */
#include "asn_internal.h"
