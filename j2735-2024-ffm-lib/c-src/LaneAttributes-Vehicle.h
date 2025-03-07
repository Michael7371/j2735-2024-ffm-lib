/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "MapData"
 * 	found in "asn/J2735-MapData-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_LaneAttributes_Vehicle_H_
#define	_LaneAttributes_Vehicle_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BIT_STRING.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum LaneAttributes_Vehicle {
	LaneAttributes_Vehicle_isVehicleRevocableLane	= 0,
	LaneAttributes_Vehicle_isVehicleFlyOverLane	= 1,
	LaneAttributes_Vehicle_hovLaneUseOnly	= 2,
	LaneAttributes_Vehicle_restrictedToBusUse	= 3,
	LaneAttributes_Vehicle_restrictedToTaxiUse	= 4,
	LaneAttributes_Vehicle_restrictedFromPublicUse	= 5,
	LaneAttributes_Vehicle_hasIRbeaconCoverage	= 6,
	LaneAttributes_Vehicle_permissionOnRequest	= 7
} e_LaneAttributes_Vehicle;

/* LaneAttributes-Vehicle */
typedef BIT_STRING_t	 LaneAttributes_Vehicle_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_LaneAttributes_Vehicle_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_LaneAttributes_Vehicle;
asn_struct_free_f LaneAttributes_Vehicle_free;
asn_struct_print_f LaneAttributes_Vehicle_print;
asn_constr_check_f LaneAttributes_Vehicle_constraint;
ber_type_decoder_f LaneAttributes_Vehicle_decode_ber;
der_type_encoder_f LaneAttributes_Vehicle_encode_der;
xer_type_decoder_f LaneAttributes_Vehicle_decode_xer;
xer_type_encoder_f LaneAttributes_Vehicle_encode_xer;
jer_type_encoder_f LaneAttributes_Vehicle_encode_jer;
oer_type_decoder_f LaneAttributes_Vehicle_decode_oer;
oer_type_encoder_f LaneAttributes_Vehicle_encode_oer;
per_type_decoder_f LaneAttributes_Vehicle_decode_uper;
per_type_encoder_f LaneAttributes_Vehicle_encode_uper;
per_type_decoder_f LaneAttributes_Vehicle_decode_aper;
per_type_encoder_f LaneAttributes_Vehicle_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _LaneAttributes_Vehicle_H_ */
#include "asn_internal.h"
