# ParkRasy – Lab Exam Ideation

## 1. Ideation (2 Marks)

- **Idea**: ParkRasy – a mobile app to find and book parking quickly.
- **Target audience**: Drivers, commuters, and anyone who needs to park in the city.
- **Problem it solves**: Reduces time spent searching for parking and allows booking in advance.
- **Core features**:
  - Find nearby parking (search by location/address).
  - Book a parking spot (now or schedule for later).
  - View and manage bookings (upcoming and past).
  - User profile (email, vehicle, payment methods, settings).
  - Logout and return to login.

## 2. 60-30-10 Color Rule (2 Marks)

- **Primary (60%)**: Dark blue – `primary_dark`, `primary`, `primary_light` in `colors.xml` (main background and cards).
- **Secondary (30%)**: Gray – `secondary`, `secondary_light`, `gray_surface` (supporting UI, hints, nav).
- **Accent (10%)**: White – `accent_white` (buttons, key text, icons).
- All colors are defined and used from `res/values/colors.xml`.

## 3. Layouts (2 Marks)

- **ScrollView**: Login, Dashboard, Find Parking, My Bookings, Profile (scrollable content).
- **LinearLayout**: Vertical/Horizontal for form fields, cards, bottom nav, spot counts.
- **ConstraintLayout**: Root for Dashboard, Find Parking, My Bookings, Profile (positioning + bottom nav).
- **FrameLayout**: Logo area on login; wrapping cards and nav items.
- **Margin and padding**: Used in layouts (e.g. 20dp/24dp padding, 8dp/12dp/16dp margins).

## 4. Views & strings.xml (2 Marks)

- **TextView**: Titles, subtitles, labels, hints.
- **EditText**: Email, password (login); search (Find Parking); email (Profile).
- **Button**: Login, Find Parking, Book, Logout, filter buttons.
- **ImageView**: Logo (ic_parking), nav icons (ic_parking, ic_calendar, ic_person), search icon.
- **CardView**: Dashboard cards, Find Parking results, My Bookings empty state, Profile rows.
- All user-facing text is in `res/values/strings.xml`.

## 5. Interactivity (1 Mark)

- **Intents**: Login → Dashboard; Dashboard → Find Parking, My Bookings, Profile; bottom nav between Find / Bookings / Profile; Profile Logout → Login (with clear task).
- No real backend; navigation only.

## 6. Creativity (1 Mark)

- Simple, modern UI with dark blue and gray theme.
- Bottom navigation on main screens.
- Dashboard “board” with quick Find Parking, active booking placeholder, and nearby spots.
- Rounded cards and buttons, consistent spacing and typography.
