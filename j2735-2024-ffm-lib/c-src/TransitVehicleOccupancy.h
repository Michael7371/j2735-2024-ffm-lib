/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "SignalRequestMessage"
 * 	found in "asn/J2735-SignalRequestMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TransitVehicleOccupancy_H_
#define	_TransitVehicleOccupancy_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum TransitVehicleOccupancy {
	TransitVehicleOccupancy_occupancyUnknown	= 0,
	TransitVehicleOccupancy_occupancyEmpty	= 1,
	TransitVehicleOccupancy_occupancyVeryLow	= 2,
	TransitVehicleOccupancy_occupancyLow	= 3,
	TransitVehicleOccupancy_occupancyMed	= 4,
	TransitVehicleOccupancy_occupancyHigh	= 5,
	TransitVehicleOccupancy_occupancyNearlyFull	= 6,
	TransitVehicleOccupancy_occupancyFull	= 7
} e_TransitVehicleOccupancy;

/* TransitVehicleOccupancy */
typedef long	 TransitVehicleOccupancy_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_TransitVehicleOccupancy_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_TransitVehicleOccupancy;
extern const asn_INTEGER_specifics_t asn_SPC_TransitVehicleOccupancy_specs_1;
asn_struct_free_f TransitVehicleOccupancy_free;
asn_struct_print_f TransitVehicleOccupancy_print;
asn_constr_check_f TransitVehicleOccupancy_constraint;
ber_type_decoder_f TransitVehicleOccupancy_decode_ber;
der_type_encoder_f TransitVehicleOccupancy_encode_der;
xer_type_decoder_f TransitVehicleOccupancy_decode_xer;
xer_type_encoder_f TransitVehicleOccupancy_encode_xer;
jer_type_encoder_f TransitVehicleOccupancy_encode_jer;
oer_type_decoder_f TransitVehicleOccupancy_decode_oer;
oer_type_encoder_f TransitVehicleOccupancy_encode_oer;
per_type_decoder_f TransitVehicleOccupancy_decode_uper;
per_type_encoder_f TransitVehicleOccupancy_encode_uper;
per_type_decoder_f TransitVehicleOccupancy_decode_aper;
per_type_encoder_f TransitVehicleOccupancy_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _TransitVehicleOccupancy_H_ */
#include "asn_internal.h"
