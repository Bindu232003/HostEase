# 🏢 HostEase - Hostel Management Android Application

HostEase is a native Android application designed to streamline communication and management tasks within a hostel or residential block environment. It provides separate, role-based dashboards for Residents and Wardens, focusing primarily on efficient complaint submission, tracking, and status updates.

## ✨ Key Features

* **Role-Based Access:** Separate login flows and user interfaces for **Residents** and **Wardens**.
* **Resident Complaint Submission:** Easy-to-use form for residents to report issues (Plumbing, Electrical, Cleaning, etc.).
* **Warden Complaint Management:** A dynamic dashboard for Wardens to view all submitted complaints and quickly update their status (Registered, Ongoing, Resolved).
* **Live Status Tracking:** Residents can view the real-time status of their submitted complaints.
* **Data Persistence:** Uses Android's `SharedPreferences` (and likely **Gson** for structured data) for local data storage and persistence.
* **Modern UI:** Clean, intuitive interface built using native Android views and Kotlin. 

---

## 🛠️ Technology Stack

* **Language:** Kotlin
* **Platform:** Native Android Development
* **IDE:** Android Studio
* **Data Storage:** `SharedPreferences` (for user sessions and complaint data)
* **Data Serialization:** [Gson (Optional, for storing lists of Complaint objects)]
* **Visualizations:** [MPAndroidChart (For displaying Complaint Status charts in dashboards)]

---

## ⚙️ Setup and Installation

### Prerequisites

* Android Studio (Latest Version Recommended)
* Android SDK (Target API 34+ / Android 14+)

### Steps

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/Bindu232003/HostEase.git](https://github.com/Bindu232003/HostEase.git)
    ```
2.  **Open in Android Studio:**
    * Open Android Studio and select **File > Open**.
    * Navigate to the cloned `HostEase` directory and select it.
3.  **Sync Gradle:**
    * Wait for Android Studio to index the project and download necessary dependencies. Click **"Sync Now"** if prompted.
4.  **Run the App:**
    * Select an Emulator (or a physical device).
    * Click the **Run** button (▶️) in the toolbar.

---

## 📄 Core Application Structure

The key components of the application are organized as follows:

| File/Directory | Description |
| :--- | :--- |
| `MainActivity.kt` | Handles the initial role selection (Resident vs. Warden). |
| `ResidentDashboardActivity.kt` | Dashboard showing announcements, complaint charts, and quick action buttons. |
| `ComplaintActivity.kt` | The form used by residents to submit new maintenance requests. |
| `WardenLogin.kt` | Handles the Warden authentication flow. |
| `WardenComplaintsActivity.kt` | The main view for the Warden to see all submitted complaints and update statuses. |
| `Complaint.kt` | (Data Class) Defines the structure for a single complaint object (ID, type, status, resident details). |
| `res/layout/` | Contains all UI layout definitions (XML files like `activity_resident_complaint.xml`). |

---

## 🤝 Contribution

If you find any bugs or have suggestions for improvements, feel free to open an issue or submit a pull request!

1.  Fork the Project.
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`).
4.  Push to the Branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.

---

## 📧 Contact

* **GitHub Profile:** [Bindu232003](https://github.com/Bindu232003)
* **Project Link:** [https://github.com/Bindu232003/HostEase](https://github.com/Bindu232003/HostEase)

***

## 📱 Screenshots

![WhatsApp Image 2025-11-21 at 14 39 12_997e3f4b](https://github.com/user-attachments/assets/df42717a-100e-4fca-87b5-221f6b5f4b0a)
![WhatsApp Image 2025-11-21 at 14 39 14_2901b174](https://github.com/user-attachments/assets/84f3f014-cdab-48c8-a6ce-3d61b073ff71)
![WhatsApp Image 2025-11-21 at 14 39 12_4118d0ba](https://github.com/user-attachments/assets/5a9b37ad-0e3d-4595-87e4-12ff45ebe507)
![WhatsApp Image 2025-11-21 at 14 41 20_5239d1f8](https://github.com/user-attachments/assets/26b54c5a-aa7b-43a9-92a9-203a4d81c464)
![WhatsApp Image 2025-11-21 at 14 39 13_3f6b21c1](https://github.com/user-attachments/assets/8dc18f65-62f0-4066-a3a6-23131dbb05ab)



