# Parameterization
# Using pytest:
# Create a new test file and do the following:
# Create a fixture named wallet() that initializes the variable 'amount' with 0
# Create a test with the following parameters:
# earned	spent	expected
# 30	    10	    20
# 20	    2 	    18
# Write a test that performs the following scenario with the parameters
#     My wallet initially has 0,
#     I add {earned} units of cash to the wallet,
#     I spend {spent} units of cash, and
#     I should have {expected} units of cash remaining after the two transactions.

import pytest

@pytest.fixture
def wallet():
    ini_amount = 0
    return ini_amount

@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18) ])
def test_trxn(wallet, earned, spent, expected):
    print("My wallet initially has {}".format(wallet))
    wallet += earned
    print("I add {} units of cash to the wallet".format(earned))
    wallet -= spent
    print("I spend {} units of cash".format(spent))
    assert wallet == expected
    print("I should have {} units of cash remaining after the transactions".format(expected))