# Logic-Bomb - Network Attack and Defense Toolkit

Logic-Bomb is a Python-based CLI tool designed for performing basic network reconnaissance, attack, and defense simulations. It offers a user-friendly interface to conduct tasks such as port scanning, brute force attempts, and network defense operations. This script is intended for educational purposes and to demonstrate basic concepts in network security.

---

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [Usage](#usage)
  - [Starting the Script](#starting-the-script)
  - [Menu Options](#menu-options)
- [Functionality Overview](#functionality-overview)
  - [Attack Options](#attack-options)
  - [Defense Options](#defense-options)
  - [Port Scanning](#port-scanning)
- [Saving Results](#saving-results)
- [Disclaimer](#disclaimer)

---

## Features

- **Dynamic Target Selection**: Specify and switch between targets easily.
- **Port Scanning**:
  - Scan all common ports (1–1024).
  - Scan specific ports.
- **Basic Attack Simulations**:
  - Placeholder for brute force and additional attack functionalities.
- **Defense Simulations**:
  - Basic Tor network integration (Auto Tor feature).
  - Log deletion (placeholder).
- **Customizable Output**:
  - Save scanning results to a file for analysis.

---

## Requirements

- Python 3.x
- Required Python libraries:
  - `os`
  - `sys`
  - `socket`
  - `concurrent.futures`
  - `tqdm`

Install missing dependencies with:
```bash
pip install tqdm
```

---

## Usage

### Starting the Script

1. Clone the repository or download the script.
2. Open a terminal and navigate to the script directory.
3. Run the script using:
   ```bash
   python3 Logic-Bomb.py <target>
   ```
   Replace `<target>` with the target hostname or IP address.

---

### Menu Options

#### Main Menu
- **[1] Attack**: Access tools for reconnaissance and attack simulations.
- **[2] Defense**: Access network defense tools.
- **[3] New Target**: Set a new target.
- **[x] Exit**: Exit the script.

#### Attack Menu
- **[1] Port Scan**: Perform port scanning on the target.
- **[2] Brute Force**: Placeholder for brute force attacks.
- **[x] Back**: Return to the main menu.

#### Defense Menu
- **[1] Auto Tor**: Placeholder for Tor network integration.
- **[2] Delete Logs**: Placeholder for log deletion functionality.

---

## Functionality Overview

### Attack Options

#### Port Scanning
- **Start (1–1024 ports)**: Scans the most common ports on the target.
- **Start (Specific Port)**: Scans a user-defined port to check if it is open.

#### Brute Force
- This feature is currently a placeholder for future development.

### Defense Options

#### Auto Tor
- Placeholder for automating Tor network integration to anonymize network traffic.

#### Delete Logs
- Placeholder for deleting local logs to enhance anonymity.

---

### Saving Results

When performing a port scan, you have the option to save the results to a file:
1. After the scan is complete, you’ll be prompted with:
   ```plaintext
   Do you want to save the result to a file? [y/n]
   ```
2. If you choose `y`, provide a filename (e.g., `results.txt`).
3. The results, including the open ports, will be saved in the specified file.

---

## Disclaimer

**This tool is intended for educational purposes only.** Unauthorized use of this script against systems without explicit permission is illegal and unethical. The developers are not responsible for any misuse of this tool.

---

Enjoy exploring network security concepts responsibly with **Logic-Bomb**!
