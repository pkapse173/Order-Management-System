/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analytics;

import customer.customer;
import customer.customerDirectory;
import deliveryPartner.deliveryPartner;
import deliveryPartner.deliveryPartnerDirectory;
import enterprise.enterprise;
import enterprise.enterpriseDirectory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import organization.organization;
import organization.organizationDirectory;

/**
 *
 * @author User
 */


public class dataAnalysis {
    
    customerDirectory customerList;
    enterpriseDirectory enterpriseList;
    organizationDirectory globalOrganizationList;
    deliveryPartnerDirectory deliveryPartnerList;

    public dataAnalysis(customerDirectory customerList, enterpriseDirectory enterpriseList, organizationDirectory globalOrganizationList, deliveryPartnerDirectory deliveryPartnerList) {
         this.customerList = customerList;
         this.enterpriseList = enterpriseList;
         this.globalOrganizationList = globalOrganizationList;
         this.deliveryPartnerList = deliveryPartnerList; 
    }
    
    public ArrayList<enterprise> top3Enterprise(){
        
        ArrayList<enterprise> topEnterprises = new ArrayList<enterprise>();
        
        HashMap<enterprise, Integer> enterpriseRevenue = new HashMap<enterprise, Integer>();

        // Calculate total revenue for each enterprise
        for (enterprise e : enterpriseList.getEnterpriseList()) {
            int totalRevenue = e.calculateEnterpriseRevenue(e);
            enterpriseRevenue.put(e, totalRevenue);
        }

        // Sorting enterprises based on total revenue using a custom comparator
        Collections.sort(enterpriseList.getEnterpriseList(), new EnterpriseRevenueComparator(enterpriseRevenue));

        // Adding the top 3 enterprises to the result list
        int count = 0;
        for (enterprise e : enterpriseList.getEnterpriseList()) {
            topEnterprises.add(e);
            count++;
            if (count == 3) {
                break;
            }
        } 
        return topEnterprises;
    }
    
    // Comparator for sorting enterprises based on total revenue
     private static class EnterpriseRevenueComparator implements java.util.Comparator<enterprise> {
        private final HashMap<enterprise, Integer> enterpriseRevenue;

        public EnterpriseRevenueComparator(HashMap<enterprise, Integer> enterpriseRevenue) {
            this.enterpriseRevenue = enterpriseRevenue;
        }

        @Override
        public int compare(enterprise e1, enterprise e2) {
            // Compare enterprises based on total revenue
            return Integer.compare(enterpriseRevenue.get(e2), enterpriseRevenue.get(e1));
        }
    }
   
     
    public ArrayList<organization> top3Organization(){
        ArrayList<organization> topOrganizations = new ArrayList<organization>();
        
        // HashMap to store the total revenue for each organization
        HashMap<organization, Integer> organizationRevenue = new HashMap<organization, Integer>();

        // Calculate total revenue for each organization
        for (organization org : globalOrganizationList.getOrganizationList()) {
            int totalRevenue = org.calculateOrganizationRevenue(org);
            organizationRevenue.put(org, totalRevenue);
        }

        // Sorting organizations based on total revenue using a custom comparator
        Collections.sort(globalOrganizationList.getOrganizationList(), new OrganizationRevenueComparator(organizationRevenue));

        // Adding the top 3 organizations to the result list
        int count = 0;
        for (organization org : globalOrganizationList.getOrganizationList()) {
            topOrganizations.add(org);
            count++;
            if (count == 3) {
                break;
            }
        }
        return topOrganizations;
    }
    
    
    // Comparator for sorting organizations based on total revenue
    private static class OrganizationRevenueComparator implements java.util.Comparator<organization> {
        private final HashMap<organization, Integer> organizationRevenue;

        public OrganizationRevenueComparator(HashMap<organization, Integer> organizationRevenue) {
            this.organizationRevenue = organizationRevenue;
        }

        @Override
        public int compare(organization org1, organization org2) {
            // Compare organizations based on total revenue
            return Integer.compare(organizationRevenue.get(org2), organizationRevenue.get(org1));
        }
    }
    
    
    public ArrayList<customer> top3Customer(){
        ArrayList<customer> topCustomers = new ArrayList<customer>();
        
        // HashMap to store the total revenue for each customer
        HashMap<customer, Integer> customerRevenue = new HashMap<customer, Integer>();

        // Calculate total revenue for each customer
        for (customer c : customerList.getCustomerList()) {
            int totalRevenue = c.calculateCustomerRevenue(c);
            customerRevenue.put(c, totalRevenue);
        }

        // Sorting customers based on total revenue using a custom comparator
        Collections.sort(customerList.getCustomerList(), new CustomerRevenueComparator(customerRevenue));

        // Adding the top 3 customers to the result list
        int count = 0;
        for (customer c : customerList.getCustomerList()) {
            topCustomers.add(c);
            count++;
            if (count == 3) {
                break;
            }
        }

        return topCustomers;
    }
    
    
    // Comparator for sorting customers based on total revenue
    private static class CustomerRevenueComparator implements java.util.Comparator<customer> {
        private final HashMap<customer, Integer> customerRevenue;

        public CustomerRevenueComparator(HashMap<customer, Integer> customerRevenue) {
            this.customerRevenue = customerRevenue;
        }

        @Override
        public int compare(customer c1, customer c2) {
            // Compare customers based on total revenue
            return Integer.compare(customerRevenue.get(c2), customerRevenue.get(c1));
        }
    }
    
    
    public ArrayList<deliveryPartner> top3DeliveryPartner(){
        
        ArrayList<deliveryPartner> topDeliveryPartners = new ArrayList<deliveryPartner>();

        // HashMap to store the total revenue for each delivery partner
        HashMap<deliveryPartner, Double> deliveryPartnerRevenue = new HashMap<deliveryPartner, Double>();

        // Calculate total revenue for each delivery partner
        for (deliveryPartner dp : deliveryPartnerList.getDeliveryPartnerList()) {
            double totalRevenue = dp.getRevenue();
            deliveryPartnerRevenue.put(dp, totalRevenue);
        }

        // Sorting delivery partners based on total revenue using a custom comparator
        Collections.sort(deliveryPartnerList.getDeliveryPartnerList(), new DeliveryPartnerRevenueComparator(deliveryPartnerRevenue));

        // Adding the top 3 delivery partners to the result list
        int count = 0;
        for (deliveryPartner dp : deliveryPartnerList.getDeliveryPartnerList()) {
            topDeliveryPartners.add(dp);
            count++;
            if (count == 3) {
                break;
            }
        }
        return topDeliveryPartners;
    }
    
    // Comparator for sorting delivery partners based on total revenue
    private static class DeliveryPartnerRevenueComparator implements java.util.Comparator<deliveryPartner> {
        private final HashMap<deliveryPartner, Double> deliveryPartnerRevenue;

        public DeliveryPartnerRevenueComparator(HashMap<deliveryPartner, Double> deliveryPartnerRevenue) {
            this.deliveryPartnerRevenue = deliveryPartnerRevenue;
        }

        @Override
        public int compare(deliveryPartner dp1, deliveryPartner dp2) {
            // Compare delivery partners based on total revenue
            return Double.compare(deliveryPartnerRevenue.get(dp2), deliveryPartnerRevenue.get(dp1));
        }
    }
    
}
