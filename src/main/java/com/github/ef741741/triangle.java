package com.github.ef741741;

import java.util.Arrays;
    public class triangle {
        private final double[] e;

        public triangle(double a, double b, double c) {
            this.e = new double[]{a, b, c};
            Arrays.sort(this.e);
        }

        public String getType() {
            if (e[0] + e[1] <= e[2]) {
                return "不是三角形";
            }
            if (e[0] * e[0] + e[1] * e[1] > e[2] + e[2]) {
                return "銳角三角形";
            }
            if (e[0] * e[0] + e[1] * e[1] == e[2] + e[2]) {
                return "直角三角形";
            }
            return "鈍角三角形";
        }
    }




