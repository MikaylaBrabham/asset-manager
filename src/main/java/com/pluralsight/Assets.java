package com.pluralsight;

public class Assets {

        private String description;
        private String dateAcquired;
        private double originalCost;

        public Assets(String description,
                     String dateAcquired,
                     double originalCost) {

            this.description = description;
            this.dateAcquired = dateAcquired;
            this.originalCost = originalCost;
        }

        public String getDescription() {
            return description;
        }

        public double getOriginalCost() {
            return originalCost;
        }

        public double getValue() {
            return originalCost;
        }
    }


