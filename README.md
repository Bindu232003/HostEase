# 🏢 HostEase - Hostel Management Android Application

HostEase is a native Android application designed to streamline communication and management tasks within a hostel or residential block environment. It provides separate, role-based dashboards for Residents and Wardens, focusing primarily on efficient complaint submission, tracking, and status updates.

## ✨ Key Features & Screenshots

| Feature | Description | Screenshot |
| :--- | :--- | :--- |
| **Welcome/Role Selection** | The initial screen allowing users to choose between Resident and Warden roles. | ![HostEase Welcome Screen]([YOUR_IMAGE_URL_FOR_Welcome]) |
| **Resident Details Setup** | Input fields for residents to enter their personal information (Name, Course, Room, Block). | ![Resident Details Input]([YOUR_IMAGE_URL_FOR_Resident_Details_Input]) |
| **Resident Status View** | Dashboard section showing the resident's current details and the status of their latest complaint (e.g., Pending). | ![Resident Dashboard Status]([YOUR_IMAGE_URL_FOR_Resident_Dashboard_Status]) |
| **Warden Login** | The dedicated login screen for hostel Wardens using a PIN. | ![Warden Login Screen]([YOUR_IMAGE_URL_FOR_Warden_Login]) |
| **Warden Welcome** | The landing page for the Warden after successful login, with a button to view complaints. | ![Warden Welcome Screen]([YOUR_IMAGE_URL_FOR_Warden_Welcome]) |
| **Warden Complaint View** | The interface for Wardens to view individual complaints and manage status updates. | ![Warden Complaint Card Example]([YOUR_IMAGE_URL_FOR_Warden_Complaint_Card]) |
| **Resident Status & Actions** | The resident dashboard showing complaint charts (requires MPAndroidChart) and quick action buttons. | ![Resident Dashboard with Chart]([YOUR_IMAGE_URL_FOR_Resident_Dashboard_Chart]) |

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
