/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_LaneRoadway_H_
#define	_LaneRoadway_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum LaneRoadway {
	LaneRoadway_all_roadways	= 8193,
	LaneRoadway_through_lanes	= 8194,
	LaneRoadway_left_lane	= 8195,
	LaneRoadway_right_lane	= 8196,
	LaneRoadway_center_lane	= 8197,
	LaneRoadway_middle_lanes	= 8198,
	LaneRoadway_middle_two_lanes	= 8199,
	LaneRoadway_right_turning_lanes	= 8200,
	LaneRoadway_left_turning_lanes	= 8201,
	LaneRoadway_upper_deck_lanes	= 8236,
	LaneRoadway_lower_deck_lanes	= 8237,
	LaneRoadway_reversible_lanes	= 8238,
	LaneRoadway_right_exit_lanes	= 8239,
	LaneRoadway_left_exit_lanes	= 8240,
	LaneRoadway_right_merging_lanes	= 8241,
	LaneRoadway_left_merging_lanes	= 8242,
	LaneRoadway_right_exit_ramp	= 8202,
	LaneRoadway_right_second_exit_ramp	= 8243,
	LaneRoadway_right_entrance_ramp	= 8203,
	LaneRoadway_right_second_entrance_ramp	= 8245,
	LaneRoadway_left_exit_ramp	= 8204,
	LaneRoadway_left_second_exit_ramp	= 8244,
	LaneRoadway_left_entrance_ramp	= 8205,
	LaneRoadway_left_second_entrance_ramp	= 8246,
	LaneRoadway_escape_ramp	= 8234,
	LaneRoadway_hard_shoulder	= 8206,
	LaneRoadway_soft_shoulder	= 8207,
	LaneRoadway_right_shoulder	= 8208,
	LaneRoadway_left_shoulder	= 8209,
	LaneRoadway_median	= 8252,
	LaneRoadway_sidewalk	= 8251,
	LaneRoadway_highways	= 8235,
	LaneRoadway_right_hand_parallel_lanes	= 8210,
	LaneRoadway_left_hand_parallel_lanes	= 8211,
	LaneRoadway_connecting_lanes	= 8212,
	LaneRoadway_express_lanes	= 8213,
	LaneRoadway_local_lanes	= 8214,
	LaneRoadway_toll_lanes	= 8215,
	LaneRoadway_electronic_toll_lanes	= 8216,
	LaneRoadway_toll_plaza	= 8217,
	LaneRoadway_inspection_lane	= 8218,
	LaneRoadway_hOV_lanes	= 8219,
	LaneRoadway_bus_lanes	= 8220,
	LaneRoadway_carpool_lanes	= 8221,
	LaneRoadway_truck_lanes	= 8222,
	LaneRoadway_emergency_lanes	= 8223,
	LaneRoadway_passing_lanes	= 8224,
	LaneRoadway_climbing_lanes	= 8225,
	LaneRoadway_slow_lane	= 8226,
	LaneRoadway_service_road	= 8227,
	LaneRoadway_cycle_lane	= 8228,
	LaneRoadway_tracks	= 8250,
	LaneRoadway_bridge	= 8229,
	LaneRoadway_overpass	= 8230,
	LaneRoadway_elevated_lanes	= 8231,
	LaneRoadway_underpass	= 8232,
	LaneRoadway_tunnel	= 8233,
	LaneRoadway_all_exit_lanes	= 8247,
	LaneRoadway_all_entry_lanes	= 8248,
	LaneRoadway_either_shoulder	= 8249,
	LaneRoadway_shoulder_work	= 8253
} e_LaneRoadway;

/* LaneRoadway */
typedef long	 LaneRoadway_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_LaneRoadway_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_LaneRoadway;
asn_struct_free_f LaneRoadway_free;
asn_struct_print_f LaneRoadway_print;
asn_constr_check_f LaneRoadway_constraint;
ber_type_decoder_f LaneRoadway_decode_ber;
der_type_encoder_f LaneRoadway_encode_der;
xer_type_decoder_f LaneRoadway_decode_xer;
xer_type_encoder_f LaneRoadway_encode_xer;
jer_type_encoder_f LaneRoadway_encode_jer;
oer_type_decoder_f LaneRoadway_decode_oer;
oer_type_encoder_f LaneRoadway_encode_oer;
per_type_decoder_f LaneRoadway_decode_uper;
per_type_encoder_f LaneRoadway_encode_uper;
per_type_decoder_f LaneRoadway_decode_aper;
per_type_encoder_f LaneRoadway_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _LaneRoadway_H_ */
#include "asn_internal.h"
