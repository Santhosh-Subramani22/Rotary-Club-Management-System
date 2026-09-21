package com.example.The.Rotary.Club;

import com.example.The.Rotary.Club.entity.*;
import com.example.The.Rotary.Club.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class TheRotaryClubApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheRotaryClubApplication.class, args);
    }

    @Bean
    CommandLineRunner seedData(
            UserRepository userRepository,
            EventRepository eventRepository,
            MeetingRepository meetingRepository,
            ServiceProjectRepository projectRepository,
            AnnouncementRepository announcementRepository) {

        return args -> {
            if (userRepository.count() == 0) {
                // Admin User
                User admin = new User();
                admin.setMemberId("RC-1001");
                admin.setFullName("Dr. Arthur Morgan");
                admin.setEmail("admin@rotary.org");
                admin.setPassword("admin123");
                admin.setPhone("+1 555-0199");
                admin.setClassification("Healthcare Administration");
                admin.setClubRole("Club President");
                admin.setRole(Role.ROLE_ADMIN);
                admin.setStatus("ACTIVE");
                admin.setJoinedDate(LocalDate.now().minusYears(3));
                userRepository.save(admin);

                // Member User
                User member = new User();
                member.setMemberId("RC-1045");
                member.setFullName("Elena Gilbert");
                member.setEmail("member@rotary.org");
                member.setPassword("member123");
                member.setPhone("+1 555-0144");
                member.setClassification("Software Engineer");
                member.setClubRole("Rotarian");
                member.setRole(Role.ROLE_MEMBER);
                member.setStatus("ACTIVE");
                member.setJoinedDate(LocalDate.now().minusMonths(8));
                userRepository.save(member);

                // Sample Project
                ServiceProject project = new ServiceProject();
                project.setProjectName("Clean Drinking Water Initiative");
                project.setAvenueOfService("Community Service");
                project.setDescription("Solar-powered water filtration plants across rural schools.");
                project.setBudget(new BigDecimal("15000.00"));
                project.setFundsRaised(new BigDecimal("11250.00"));
                project.setTargetBeneficiaries(3200);
                project.setVolunteersCount(18);
                project.setStartDate(LocalDate.now().minusMonths(1));
                project.setTargetCompletionDate(LocalDate.now().plusMonths(3));
                project.setStatus("IN_PROGRESS");
                projectRepository.save(project);

                // Sample Event
                Event event = new Event();
                event.setTitle("Annual Rotary Polio Gala");
                event.setDescription("Charity banquet and silent auction for End Polio Now.");
                event.setCategory("Fundraiser");
                event.setEventDate(LocalDateTime.now().plusDays(10));
                event.setVenue("Grand Ballroom, City Center");
                event.setMaxCapacity(150);
                event.setRegisteredCount(84);
                event.setStatus("UPCOMING");
                eventRepository.save(event);

                // Sample Meeting
                Meeting meeting = new Meeting();
                meeting.setTitle("Weekly Regular Club Fellowship Meeting");
                meeting.setMeetingTime(LocalDateTime.now().plusDays(3).withHour(19).withMinute(0));
                meeting.setMeetingType("Weekly Regular");
                meeting.setVenueOrLink("Rotary House Hall A / Zoom");
                meeting.setAgenda("1. Call to order\n2. 4-Way Test recitation\n3. Guest speaker presentation\n4. Fellowship dinner");
                meeting.setMinutesOfMeeting("Previous minutes confirmed without amendments.");
                meeting.setAttendanceCount(42);
                meetingRepository.save(meeting);

                // Sample Announcement
                Announcement announcement = new Announcement();
                announcement.setTitle("District Governor Official Visitation");
                announcement.setMessage("DG visit scheduled next Tuesday. All members are requested to attend in formal club attire.");
                announcement.setPriority("HIGH");
                announcement.setPublishedBy("Club Secretary");
                announcement.setPublishedAt(LocalDateTime.now().minusHours(3));
                announcementRepository.save(announcement);
            }
        };
    }
}