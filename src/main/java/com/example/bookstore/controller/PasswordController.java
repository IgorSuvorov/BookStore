package com.example.bookstore.controller;

/**
 * @author Igor Suvorov
 */
@Controller
@RequestMapping("/password")
public class PasswordController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/change")
    public String showChangePasswordForm(Model model) {
        model.addAttribute("passwordChangeRequest", new PasswordChangeRequest());
        return "auth/change-password";
    }

    @PostMapping("/change")
    public String changePassword(@ModelAttribute("passwordChangeRequest") PasswordChangeRequest passwordChangeRequest,
                                 Principal principal) {
        User user = userRepository.findByUsername(principal.getName());
        if (user != null && passwordEncoder.matches(passwordChangeRequest.getOldPassword(), user.getPassword())) {
            user.setPassword(passwordEncoder.encode(passwordChangeRequest.getNewPassword()));
            userRepository.save(user);
            return "redirect:/password/change?success";
        }
        return "redirect:/password/change?error";
    }
}
