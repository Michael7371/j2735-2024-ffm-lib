/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "Extent.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_Extent_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_Extent_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED,	 4,  4,  0,  15 }	/* (0..15) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_Extent_value2enum_1[] = {
	{ 0,	16,	"useInstantlyOnly" },
	{ 1,	13,	"useFor3meters" },
	{ 2,	14,	"useFor10meters" },
	{ 3,	14,	"useFor50meters" },
	{ 4,	15,	"useFor100meters" },
	{ 5,	15,	"useFor500meters" },
	{ 6,	16,	"useFor1000meters" },
	{ 7,	16,	"useFor5000meters" },
	{ 8,	17,	"useFor10000meters" },
	{ 9,	17,	"useFor50000meters" },
	{ 10,	18,	"useFor100000meters" },
	{ 11,	18,	"useFor500000meters" },
	{ 12,	19,	"useFor1000000meters" },
	{ 13,	19,	"useFor5000000meters" },
	{ 14,	20,	"useFor10000000meters" },
	{ 15,	7,	"forever" }
};
static const unsigned int asn_MAP_Extent_enum2value_1[] = {
	15,	/* forever(15) */
	14,	/* useFor10000000meters(14) */
	12,	/* useFor1000000meters(12) */
	10,	/* useFor100000meters(10) */
	8,	/* useFor10000meters(8) */
	6,	/* useFor1000meters(6) */
	4,	/* useFor100meters(4) */
	2,	/* useFor10meters(2) */
	1,	/* useFor3meters(1) */
	13,	/* useFor5000000meters(13) */
	11,	/* useFor500000meters(11) */
	9,	/* useFor50000meters(9) */
	7,	/* useFor5000meters(7) */
	5,	/* useFor500meters(5) */
	3,	/* useFor50meters(3) */
	0	/* useInstantlyOnly(0) */
};
const asn_INTEGER_specifics_t asn_SPC_Extent_specs_1 = {
	asn_MAP_Extent_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_Extent_enum2value_1,	/* N => "tag"; sorted by N */
	16,	/* Number of elements in the maps */
	0,	/* Enumeration is not extensible */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_Extent_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_Extent = {
	"Extent",
	"Extent",
	&asn_OP_NativeEnumerated,
	asn_DEF_Extent_tags_1,
	sizeof(asn_DEF_Extent_tags_1)
		/sizeof(asn_DEF_Extent_tags_1[0]), /* 1 */
	asn_DEF_Extent_tags_1,	/* Same as above */
	sizeof(asn_DEF_Extent_tags_1)
		/sizeof(asn_DEF_Extent_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_Extent_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_Extent_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_Extent_specs_1	/* Additional specs */
};

