/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadSafetyMessage"
 * 	found in "asn/J2945-4-RoadSafetyMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_AreaType_H_
#define	_AreaType_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BroadRegion.h"
#include "PathList.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum AreaType_PR {
	AreaType_PR_NOTHING,	/* No components present */
	AreaType_PR_broadRegion,
	AreaType_PR_paths
	/* Extensions may appear below */
	
} AreaType_PR;

/* AreaType */
typedef struct AreaType {
	AreaType_PR present;
	union AreaType_u {
		BroadRegion_t	 broadRegion;
		PathList_t	 paths;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} AreaType_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_AreaType;
extern asn_CHOICE_specifics_t asn_SPC_AreaType_specs_1;
extern asn_TYPE_member_t asn_MBR_AreaType_1[2];
extern asn_per_constraints_t asn_PER_type_AreaType_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _AreaType_H_ */
#include "asn_internal.h"
