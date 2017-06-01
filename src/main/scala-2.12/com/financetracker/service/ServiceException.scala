package com.financetracker.service

trait ServiceException extends Exception
case object UnauthorizedServiceException extends ServiceException
case object OutdatedTokenServiceException extends ServiceException
case object UnknownServiceException extends ServiceException
