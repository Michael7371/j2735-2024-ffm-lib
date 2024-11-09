/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ReceiptObuId_H_
#define	_ReceiptObuId_H_


#include "asn_application.h"

/* Including external dependencies */
#include "OCTET_STRING.h"

#ifdef __cplusplus
extern "C" {
#endif

/* ReceiptObuId */
typedef OCTET_STRING_t	 ReceiptObuId_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ReceiptObuId;
asn_struct_free_f ReceiptObuId_free;
asn_struct_print_f ReceiptObuId_print;
asn_constr_check_f ReceiptObuId_constraint;
ber_type_decoder_f ReceiptObuId_decode_ber;
der_type_encoder_f ReceiptObuId_encode_der;
xer_type_decoder_f ReceiptObuId_decode_xer;
xer_type_encoder_f ReceiptObuId_encode_xer;
jer_type_encoder_f ReceiptObuId_encode_jer;
oer_type_decoder_f ReceiptObuId_decode_oer;
oer_type_encoder_f ReceiptObuId_encode_oer;
per_type_decoder_f ReceiptObuId_decode_uper;
per_type_encoder_f ReceiptObuId_encode_uper;
per_type_decoder_f ReceiptObuId_decode_aper;
per_type_encoder_f ReceiptObuId_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _ReceiptObuId_H_ */
#include "asn_internal.h"