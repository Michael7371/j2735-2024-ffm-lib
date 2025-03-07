/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ManeuverSharingAndCoordinatingMessage"
 * 	found in "asn/J3186-ManeuverSharingandCoordinatingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "LaneOffset.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_LaneOffset_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_LaneOffset_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED | APC_EXTENSIBLE,  3,  3,  0,  6 }	/* (0..6,...) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_LaneOffset_value2enum_1[] = {
	{ 0,	11,	"currentLane" },
	{ 1,	13,	"firstLeftLane" },
	{ 2,	14,	"firstRightLane" },
	{ 3,	14,	"secondLeftLane" },
	{ 4,	15,	"secondRightLane" },
	{ 5,	13,	"thirdLeftLane" },
	{ 6,	14,	"thirdRightLane" }
	/* This list is extensible */
};
static const unsigned int asn_MAP_LaneOffset_enum2value_1[] = {
	0,	/* currentLane(0) */
	1,	/* firstLeftLane(1) */
	2,	/* firstRightLane(2) */
	3,	/* secondLeftLane(3) */
	4,	/* secondRightLane(4) */
	5,	/* thirdLeftLane(5) */
	6	/* thirdRightLane(6) */
	/* This list is extensible */
};
const asn_INTEGER_specifics_t asn_SPC_LaneOffset_specs_1 = {
	asn_MAP_LaneOffset_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_LaneOffset_enum2value_1,	/* N => "tag"; sorted by N */
	7,	/* Number of elements in the maps */
	8,	/* Extensions before this member */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_LaneOffset_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_LaneOffset = {
	"LaneOffset",
	"LaneOffset",
	&asn_OP_NativeEnumerated,
	asn_DEF_LaneOffset_tags_1,
	sizeof(asn_DEF_LaneOffset_tags_1)
		/sizeof(asn_DEF_LaneOffset_tags_1[0]), /* 1 */
	asn_DEF_LaneOffset_tags_1,	/* Same as above */
	sizeof(asn_DEF_LaneOffset_tags_1)
		/sizeof(asn_DEF_LaneOffset_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_LaneOffset_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_LaneOffset_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_LaneOffset_specs_1	/* Additional specs */
};

