# workshop-card-center
sample template for writing and reading Mifare 1K card data using ACR122u

## Card data allocation
| No | Data       | Length |
|----|------------|--------|
| 1  | NIP/NIM    | 18     |
| 2  | Birth date | 4      |
| 3  | Expired    | 4      |
| 4  | Gender     | 1      |
| 5  | Status     | 1      |

## Hardware requirements
+ Reader ACR122u
+ MIfare 1K

## Software requirements
+ Driver ACR122U
+ Minimum JDK 8
+ Netbeans 8.2
