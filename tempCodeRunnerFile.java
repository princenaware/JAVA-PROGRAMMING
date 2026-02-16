
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Display result
        System.out.println("Largest number in the array is: " + max);
    }
}