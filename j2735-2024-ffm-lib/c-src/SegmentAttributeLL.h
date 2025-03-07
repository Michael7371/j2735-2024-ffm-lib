/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TravelerInformation"
 * 	found in "asn/J2735-TravelerInformation-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_SegmentAttributeLL_H_
#define	_SegmentAttributeLL_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum SegmentAttributeLL {
	SegmentAttributeLL_reserved	= 0,
	SegmentAttributeLL_doNotBlock	= 1,
	SegmentAttributeLL_whiteLine	= 2,
	SegmentAttributeLL_mergingLaneLeft	= 3,
	SegmentAttributeLL_mergingLaneRight	= 4,
	SegmentAttributeLL_curbOnLeft	= 5,
	SegmentAttributeLL_curbOnRight	= 6,
	SegmentAttributeLL_loadingzoneOnLeft	= 7,
	SegmentAttributeLL_loadingzoneOnRight	= 8,
	SegmentAttributeLL_turnOutPointOnLeft	= 9,
	SegmentAttributeLL_turnOutPointOnRight	= 10,
	SegmentAttributeLL_adjacentParkingOnLeft	= 11,
	SegmentAttributeLL_adjacentParkingOnRight	= 12,
	SegmentAttributeLL_adjacentBikeLaneOnLeft	= 13,
	SegmentAttributeLL_adjacentBikeLaneOnRight	= 14,
	SegmentAttributeLL_sharedBikeLane	= 15,
	SegmentAttributeLL_bikeBoxInFront	= 16,
	SegmentAttributeLL_transitStopOnLeft	= 17,
	SegmentAttributeLL_transitStopOnRight	= 18,
	SegmentAttributeLL_transitStopInLane	= 19,
	SegmentAttributeLL_sharedWithTrackedVehicle	= 20,
	SegmentAttributeLL_safeIsland	= 21,
	SegmentAttributeLL_lowCurbsPresent	= 22,
	SegmentAttributeLL_rumbleStripPresent	= 23,
	SegmentAttributeLL_audibleSignalingPresent	= 24,
	SegmentAttributeLL_adaptiveTimingPresent	= 25,
	SegmentAttributeLL_rfSignalRequestPresent	= 26,
	SegmentAttributeLL_partialCurbIntrusion	= 27,
	SegmentAttributeLL_taperToLeft	= 28,
	SegmentAttributeLL_taperToRight	= 29,
	SegmentAttributeLL_taperToCenterLine	= 30,
	SegmentAttributeLL_parallelParking	= 31,
	SegmentAttributeLL_headInParking	= 32,
	SegmentAttributeLL_freeParking	= 33,
	SegmentAttributeLL_timeRestrictionsOnParking	= 34,
	SegmentAttributeLL_costToPark	= 35,
	SegmentAttributeLL_midBlockCurbPresent	= 36,
	SegmentAttributeLL_unEvenPavementPresent	= 37
	/*
	 * Enumeration is extensible
	 */
} e_SegmentAttributeLL;

/* SegmentAttributeLL */
typedef long	 SegmentAttributeLL_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_SegmentAttributeLL_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_SegmentAttributeLL;
extern const asn_INTEGER_specifics_t asn_SPC_SegmentAttributeLL_specs_1;
asn_struct_free_f SegmentAttributeLL_free;
asn_struct_print_f SegmentAttributeLL_print;
asn_constr_check_f SegmentAttributeLL_constraint;
ber_type_decoder_f SegmentAttributeLL_decode_ber;
der_type_encoder_f SegmentAttributeLL_encode_der;
xer_type_decoder_f SegmentAttributeLL_decode_xer;
xer_type_encoder_f SegmentAttributeLL_encode_xer;
jer_type_encoder_f SegmentAttributeLL_encode_jer;
oer_type_decoder_f SegmentAttributeLL_decode_oer;
oer_type_encoder_f SegmentAttributeLL_encode_oer;
per_type_decoder_f SegmentAttributeLL_decode_uper;
per_type_encoder_f SegmentAttributeLL_encode_uper;
per_type_decoder_f SegmentAttributeLL_decode_aper;
per_type_encoder_f SegmentAttributeLL_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _SegmentAttributeLL_H_ */
#include "asn_internal.h"
