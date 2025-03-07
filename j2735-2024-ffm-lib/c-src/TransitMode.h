/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TransitMode_H_
#define	_TransitMode_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum TransitMode {
	TransitMode_travel	= 8961,
	TransitMode_transit	= 8962,
	TransitMode_bus	= 8963,
	TransitMode_trolleybus	= 8964,
	TransitMode_rail	= 8965,
	TransitMode_commuter_rail	= 8966,
	TransitMode_subway	= 8967,
	TransitMode_rapid_transit	= 8968,
	TransitMode_light_rail	= 8969,
	TransitMode_streetcar	= 8970,
	TransitMode_dial_a_ride	= 8971,
	TransitMode_park_and_ride	= 8972,
	TransitMode_shuttle	= 8973,
	TransitMode_free_shuttle	= 8974,
	TransitMode_airport_shuttle	= 8975,
	TransitMode_taxies	= 8976,
	TransitMode_ferry	= 8977,
	TransitMode_passenger_ferry	= 8978,
	TransitMode_vehicle_ferry	= 8979,
	TransitMode_aerial_tramway	= 8980,
	TransitMode_automated_guideway	= 8981,
	TransitMode_cable_cars	= 8982,
	TransitMode_monorail	= 8983,
	TransitMode_air_travel	= 8984,
	TransitMode_hitch_hitching	= 8985,
	TransitMode_walk	= 8986
} e_TransitMode;

/* TransitMode */
typedef long	 TransitMode_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_TransitMode_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_TransitMode;
asn_struct_free_f TransitMode_free;
asn_struct_print_f TransitMode_print;
asn_constr_check_f TransitMode_constraint;
ber_type_decoder_f TransitMode_decode_ber;
der_type_encoder_f TransitMode_encode_der;
xer_type_decoder_f TransitMode_decode_xer;
xer_type_encoder_f TransitMode_encode_xer;
jer_type_encoder_f TransitMode_encode_jer;
oer_type_decoder_f TransitMode_decode_oer;
oer_type_encoder_f TransitMode_encode_oer;
per_type_decoder_f TransitMode_decode_uper;
per_type_encoder_f TransitMode_encode_uper;
per_type_decoder_f TransitMode_decode_aper;
per_type_encoder_f TransitMode_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _TransitMode_H_ */
#include "asn_internal.h"
