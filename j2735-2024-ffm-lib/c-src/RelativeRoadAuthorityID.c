/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "RelativeRoadAuthorityID.h"

/*
 * This type is implemented using RELATIVE_OID,
 * so here we adjust the DEF accordingly.
 */
static const ber_tlv_tag_t asn_DEF_RelativeRoadAuthorityID_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (13 << 2))
};
asn_TYPE_descriptor_t asn_DEF_RelativeRoadAuthorityID = {
	"RelativeRoadAuthorityID",
	"RelativeRoadAuthorityID",
	&asn_OP_RELATIVE_OID,
	asn_DEF_RelativeRoadAuthorityID_tags_1,
	sizeof(asn_DEF_RelativeRoadAuthorityID_tags_1)
		/sizeof(asn_DEF_RelativeRoadAuthorityID_tags_1[0]), /* 1 */
	asn_DEF_RelativeRoadAuthorityID_tags_1,	/* Same as above */
	sizeof(asn_DEF_RelativeRoadAuthorityID_tags_1)
		/sizeof(asn_DEF_RelativeRoadAuthorityID_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		RELATIVE_OID_constraint
	},
	0, 0,	/* No members */
	0	/* No specifics */
};
