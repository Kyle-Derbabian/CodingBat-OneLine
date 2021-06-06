alarm_clock = lambda day, vacation : "10:00" if vacation and day >= 1 and day <= 5 else "off" if vacation else "7:00" if not vacation and day >= 1 and day <= 5 else "10:00"
