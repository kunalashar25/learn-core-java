package com.java.testCode.String;

import java.util.LinkedList;
import java.util.List;

public class MultiSplit {

	static String test = "Requisition [id=null, requesterName=null, reqName=APIon_Req_1519645968915, reqNo=null, isRequired=false, attactmentFile=null, reasonForOrdering=null, commentForSupplier=null, onBehalfOf=null, assignedBuyer=null, purchaseType=null, settlementvia=SETTLEMENT_VIA_OPTION_INVOICE, createdDate=null, isActive=true, status=null, result=false, items=Item [catelogItems=[CatelogItem [itemName=laptop, description=null, category=null, itemID=null, supplier=null, delieveryDays=0, unitCurrency=null, unitPrice=0.0, userCurrency=null, userCurrencyConversionRate=0.0, itemPriceInUserCurrency=0.0, quantity=8]], guidedItems=null, punchoutItems=null, itemMasterItems=null, isEmptyCart=true], billingRequisitionSummary=null, deliveryRequisitionSummary=null, costBookingRequisitionSummary=CostBookingRequisitionSummary [assignedProjectToPurchaseCost=null, bookCostToSingleCostCenter=true, splitCostToMultipleCostCenter=false, splitCostAtLineItemLevel=false, costCenter=CC-BU LEVEL, budget=Arti_here_again, project=project BU, nextAction=SAVE, listOfSplitedCostCenters=[], glAccount=GL_Account_return note, allowBudgetUtilization=null], deliveryItemSummary=null, costBookingItemSummary=CostBookingItemSummary [id=0, splitCostCenterAtItemLevel=false, splitCostCenterAtItemLevel_percentage=false, splitCostCenterAtItemLevel_quantity=false, splitCostCenterAtItemLevel_quantityProportionalToDelivery=false, nextAction=SAVE, costCenterSplitInfo=[], accountingItemSummary=AccountingItemSummary [glAccountType=null, glAccount=GL_Account_return note, nextAction=null, assetCode=Arti_123], subTotalPrice=null], accountingItemSummary=null, attachmentsAndCommentsItemSummary=null, customDate=CustomDate [day=26, month=1, year=2018, date=26/2/2018], nextAction=SUBMIT_REQ, pcard=null, editHeaderLevelInfo=true, showAllPos=false, editItemLevelInfo=true, modifyWorkflowSettings=false, verifyWorkflow=true, totalPrice=null, overrideGlAccount=false, isChangeMultiple=false, changeMultiple=ChangeMultiple [glAccount=null, costCenter=null, budget=null, project=null, requiredByDate=CustomDate [day=0, month=0, year=0, date=null]], poNo=null, purchaseOrdersList=[], approver=null, editCOAInfo=false, editMiscellaneous=false, coaAction=null, coaDataList=[], itemSummaryCoa=null, isVerificationRequiredOnPO=false, recallRequisitionVia=VIA_ACTION_DROPDOWN, assignedBuyerGroup=null, sharePointURL_eForm=null, internalDeliveryLocation_eForm=null, deliveryInstruction_eForm=null, estimatedFreight_eForm=null, purchasingInstructions_eForm=null, isExternalAgentAvailable=false, requisitionExternalId=null, isThePurchaseBudgeted=null, whatIsPurchasedandWHY=null, isPurchasedBefore=null, isPriceIncrease=null, isAdditionalSavings=null, SavingsAchieved=null, retrospectivePurchase=false]";

	public static void main(String[] args) {
		List<String> boList = new LinkedList<String>();

		String[] initialSplit = test.trim().split("\\[");

		for (int i = 0; i < initialSplit.length; i++) {

			String[] secondSplit = initialSplit[i].trim().split(",");

			for (int j = 0; j < secondSplit.length; j++) {

				if (secondSplit[j].contains("]")) {
					String[] thirdSplit = secondSplit[j].trim().split("\\]");
					if (thirdSplit.length == 1) {
						// System.out.println(thirdSplit[0]);
						boList.add(thirdSplit[0].trim());
					}
				} else {
					// System.out.println(secondSplit[j].trim());
					boList.add(secondSplit[j].trim());
				}
			}
		}

		System.out.println(boList);

	}

}
