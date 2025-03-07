/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "SensorDataSharingMessage"
 * 	found in "asn/J3224-SensorDataSharingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "RollRateConfidence.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_RollRateConfidence_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_RollRateConfidence_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED,	 3,  3,  0,  7 }	/* (0..7) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_RollRateConfidence_value2enum_1[] = {
	{ 0,	11,	"unavailable" },
	{ 1,	13,	"degSec-100-00" },
	{ 2,	13,	"degSec-010-00" },
	{ 3,	13,	"degSec-005-00" },
	{ 4,	13,	"degSec-001-00" },
	{ 5,	13,	"degSec-000-10" },
	{ 6,	13,	"degSec-000-05" },
	{ 7,	13,	"degSec-000-01" }
};
static const unsigned int asn_MAP_RollRateConfidence_enum2value_1[] = {
	7,	/* degSec-000-01(7) */
	6,	/* degSec-000-05(6) */
	5,	/* degSec-000-10(5) */
	4,	/* degSec-001-00(4) */
	3,	/* degSec-005-00(3) */
	2,	/* degSec-010-00(2) */
	1,	/* degSec-100-00(1) */
	0	/* unavailable(0) */
};
const asn_INTEGER_specifics_t asn_SPC_RollRateConfidence_specs_1 = {
	asn_MAP_RollRateConfidence_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_RollRateConfidence_enum2value_1,	/* N => "tag"; sorted by N */
	8,	/* Number of elements in the maps */
	0,	/* Enumeration is not extensible */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_RollRateConfidence_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_RollRateConfidence = {
	"RollRateConfidence",
	"RollRateConfidence",
	&asn_OP_NativeEnumerated,
	asn_DEF_RollRateConfidence_tags_1,
	sizeof(asn_DEF_RollRateConfidence_tags_1)
		/sizeof(asn_DEF_RollRateConfidence_tags_1[0]), /* 1 */
	asn_DEF_RollRateConfidence_tags_1,	/* Same as above */
	sizeof(asn_DEF_RollRateConfidence_tags_1)
		/sizeof(asn_DEF_RollRateConfidence_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_RollRateConfidence_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_RollRateConfidence_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_RollRateConfidence_specs_1	/* Additional specs */
};

