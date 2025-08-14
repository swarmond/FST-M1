# Fixtures
# Using pytest:
# Create a new test file and do the following:
# Create a fixture that initializes a list containing numbers from 0-10.
# Write a test method asserting that the sum of that list is 55
# Once you confirm that the test passes, move the fixture into the conftest.py file and rerun the test.

import pytest

# Creating fixture


# Test method
def test_sum(num_list):

    # Initialize sum
    sum = 0

    # Add number in the list
    for n in num_list:
        sum += n

    # Assertion
    assert sum == 55