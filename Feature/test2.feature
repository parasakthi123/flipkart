Feature: In flipkart adding the mobiles in cart

Scenario Outline: 
Given the user is in flipkart website
When user added the five "<mobile1>","<mobile2>","<mobile3>","<mobile4>","<mobile5>" in the cart
Then user verifies the mobile items in cart

Examples:
|mobile1|mobile2|mobile3|mobile4|mobile5|
|Apple iPhone X (Space Gray, 256 GB)|Apple iPhone X (Space Gray, 64 GB)|Apple iPhone X (Silver, 64 GB)|Apple iPhone X (Silver, 256 GB)|Apple iPhone 7 (Black, 32 GB)|
